

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture 
{
	public static Texture wood = new Texture("resources/pictures/sprites/banner.png", 64);
	public static Texture brick = new Texture("resources/pictures/sprites/stone.png", 64);
	public static Texture bluestone = new Texture("resources/pictures/sprites/door.png", 64);
	public static Texture stone = new Texture("resources/pictures/sprites/torch.gif", 64);
	public static Texture enemy = new Texture("resources/pictures/sprites/gladiator.png", 64);
	public static Texture win = new Texture("resources/pictures/sprites/win.png", 64);
	public static Texture lose = new Texture("resources/pictures/sprites/lose.png", 64);
	public static Texture doorL = new Texture("resources/pictures/sprites/DoorLeft.png", 64);
	public static Texture doorR = new Texture("resources/pictures/sprites/DoorRight.png", 64);
	public static Texture d = new Texture("resources/pictures/sprites/Damage.png", 64);
	
	public int[] pixels;
	private String loc;
	public final int SIZE;
	
	public Texture(String location, int size) 
	{
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	private void load() 
	{
		try 
		{
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
