
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.Random;
import javax.sound.sampled.Clip;

public class Bianparty
{
	private static int num;
	private Clip clip;
	private Timer timer;

	JPanel gui;
	/** Displays the image. */
	JLabel imageCanvas;

	/** Set the image as icon of the image canvas (display it). */
	public void setImage(Image image)
	{
		imageCanvas.setIcon(new ImageIcon(image));
	}

	public void initComponents()
	{
		if (gui == null)
		{
			gui = new JPanel(new BorderLayout());
			gui.setBorder(new EmptyBorder(0, 0, 0, 0));
			imageCanvas = new JLabel();

			JPanel imageCenter = new JPanel(new GridBagLayout());
			imageCenter.add(imageCanvas);
			JScrollPane imageScroll = new JScrollPane(imageCenter);
			imageScroll.setPreferredSize(new Dimension(500, 899));
			gui.add(imageScroll, BorderLayout.CENTER);
		}
	}

	public Container getGui()
	{
		initComponents();
		return gui;
	}

	public static Image getNextImage()
	{
		try
		{
			URL url = GameFrame.class.getResource("/pictures/BP-" + num + ".jpg");
			File f;
			try
			{
				f = new File(url.toURI());
			} catch (URISyntaxException e)
			{
				f = new File(url.getPath());
			}
			Image image = ImageIO.read(f);
			if (num < 1)
			{
				num++;
			} else
			{
				num = 0;
			}
			return image;
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}
		return new BufferedImage(100, 100, 1);
	}

	public void run()
	{
		JFrame f = new JFrame("Bianparty PC@Aerone");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final Bianparty viewer = new Bianparty();
		f.setContentPane(viewer.getGui());

		f.pack();
		f.setLocationByPlatform(true);
		f.setVisible(true);

		ActionListener animate = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				viewer.setImage(colorImage((BufferedImage)getNextImage()));
				clip.setFramePosition(clip.getFramePosition() + (int)(Math.random() * 100000) - 25000);
				timer.setDelay((int)(Math.random()*1500)+50);
			}
		};
		timer = new Timer(150, animate);
		timer.start();
		try
		{
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(GameFrame.class.getResource("Adele - Hello.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			clip.loop(5000);
		} catch (Exception ex)
		{
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	private static BufferedImage colorImage(BufferedImage image)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		WritableRaster raster = image.getRaster();

		double rand = Math.random()*(int)(Math.random()*10);
		double rand1 = Math.random()*(int)(Math.random()*10);
		double rand2 = Math.random()*(int)(Math.random()*10);
		for (int xx = 0; xx < width; xx++)
		{
			for (int yy = 0; yy < height; yy++)
			{
				int[] pixels = raster.getPixel(xx, yy, (int[]) null);
				pixels[0] = (int) (pixels[0]*rand);
				pixels[1] = (int) (pixels[1]*rand1);
				pixels[2] = (int) (pixels[2]*rand2);
				raster.setPixel(xx, yy, pixels);
			}
		}
		return image;
	}

	public static void main(String[] args) throws Exception
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				JFrame f = new JFrame("Bianparty");
				// TODO Fix kludge to kill the Timer
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				final Bianparty viewer = new Bianparty();
				f.setContentPane(viewer.getGui());

				f.pack();
				f.setLocationByPlatform(true);
				f.setVisible(true);

				ActionListener animate = new ActionListener()
				{

					Random random = new Random();

					@Override
					public void actionPerformed(ActionEvent arg0)
					{
						viewer.setImage(getNextImage());
					}
				};
				Timer timer = new Timer(500, animate);
				timer.start();
			}
		};
		SwingUtilities.invokeLater(r);
	}
}