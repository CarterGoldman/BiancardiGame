

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Battle extends JFrame implements Runnable
{
	private static final long serialVersionUID = 1L;
	public int mapWidth = 26;
	public int mapHeight = 35;
	public static int health = 240;
	private Thread thread;
	private boolean running;
	private BufferedImage image;
	public int[] pixels;
	public ArrayList<Texture> textures;
	public static Camera camera;
	public static Droid droid;
	public Screen screen;
	public int winner = 0;
	public static int[][] map = {{1,2,1,2,4,3,4,2,1,2,1,2,8,9,2,1,2,1,2,4,3,4,2,1,2,1},
								 {2,0,0,0,0,0,0,0,1,2,1,0,0,0,0,1,2,1,0,0,0,0,0,0,0,2},
								 {1,0,0,0,0,0,2,4,0,0,0,0,0,0,0,0,0,0,4,2,0,0,0,0,0,1},
								 {2,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,2},
								 {1,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,1},
								 {4,0,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,0,0,4},
								 {1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
								 {2,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,2},
								 {1,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,0,1},
								 {2,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,2},
								 {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
								 {4,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,4},
								 {1,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,1},
								 {2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2},
								 {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
								 {2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2},
								 {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
								 {4,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,4},
								 {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
								 {2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2},
								 {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
								 {2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2},
								 {1,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,1},
								 {4,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,4},
								 {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
								 {2,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,2},
								 {1,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,0,1},
								 {2,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,2},
								 {1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
								 {4,0,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,0,0,4},
								 {1,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,1},
								 {2,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,2},
								 {1,0,0,0,0,0,2,4,0,0,0,0,0,0,0,0,0,0,4,2,0,0,0,0,0,1},
								 {2,0,0,0,0,0,0,0,1,2,1,0,0,0,0,1,2,1,0,0,0,0,0,0,0,2},
								 {1,2,1,2,4,3,4,2,1,2,1,2,9,8,2,1,2,1,2,4,3,4,2,1,2,1}};
	
	public Battle()
	{
		thread = new Thread(this);
		image = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
		textures = new ArrayList<Texture>();
		textures.add(Texture.wood);
		textures.add(Texture.brick);
		textures.add(Texture.bluestone);
		textures.add(Texture.stone);
		textures.add(Texture.enemy);
		textures.add(Texture.win);
		textures.add(Texture.lose);
		textures.add(Texture.doorL);
		textures.add(Texture.doorR);
		textures.add(Texture.d);
		camera = new Camera(1.0, 12.0, 1, 0, 0, -.66);
		droid = new Droid(34.0, 13.0, 1, 0, 0, -.66, camera);
		screen = new Screen(map, mapWidth, mapHeight, textures, 640, 480);
		addKeyListener(camera);
		setSize(640, 480);
		setResizable(false);
		setTitle("3D Engine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.CYAN);
		setLocationRelativeTo(null);
		setVisible(true);
		start();
	}
	
	private synchronized void start() 
	{
		running = true;
		thread.start();
	}
	
	public synchronized void stop() 
	{
		running = false;
		Long time = (long) 30000;
		try {
			this.wait(time);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		//insert win output
		System.exit(0);
	}
	
	public void render() 
	{
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) 
		{
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
		bs.show();
	}
	
	public void run()
	{
		int count = 0;
		long lastTime = System.nanoTime();
		final double ns = 1000000000.0 / 60.0;
		double delta = 0;
		requestFocus();
		while(running) 
			{
			long now = System.nanoTime();
			delta = delta + ((now-lastTime) / ns);
			lastTime = now;
			while (delta >= 1)
				{
				screen.update(camera, pixels);
				camera.update(map, droid, textures);
				map = droid.update(map, textures);
				if(droid.health < 0)
				{
					count++;
					
					if(count > 30)
					{	
						JOptionPane.showMessageDialog(rootPane, "Player has juan.");;;;;
						for (int x = 0; x < 6; x++)
						{
							Biancardi biancardi = new Biancardi();
							biancardi.bianparty();
						}
						
						stop();
					}
				}
				health = droid.attack((int)camera.getX(), (int)camera.getY(), health);
				if(health <= 0)
				{
					count++;
					droid.health -= 800;
					droid.win(map);
					
					if(count > 30)
					{
						JOptionPane.showMessageDialog(rootPane, "Player has los.");
						stop();
					}
				}
				delta--;
				}
			render();
			}
	}
	
	public static void main(String [] args) 
	{
		Battle game = new Battle();
	}
}
