

	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
import java.util.ArrayList;

	public class Droid implements KeyListener
	{
		public double xPos, yPos, xDir, yDir, xPlane, yPlane;
		public Camera camera;
		public boolean left, right, forward, back, tLeft, tRight;
		public final double MOVE_SPEED = .02;
		public final double ROTATION_SPEED = .045;
		public int health = 180;
		
		public Droid(double x, double y, double xd, double yd, double xp, double yp, Camera cam) 
		{	
			xPos = x;
			yPos = y;
			xDir = xd;
			yDir = yd;
			xPlane = xp;
			yPlane = yp;
			camera = cam;
		}
		
		public void keyPressed(KeyEvent key) 
		{

		}
		
		public void keyReleased(KeyEvent key)
		{

		}
		
		public int attack(int x, int y, int h)
		{
			int health = h;
			int xP = (int)xPos;
			int yP = (int)yPos;
			if(((xP==x && yP==y) || (xP-1==x && yP-1==y) || (xP+1==x && yP+1==y) || (xP-1==x && yP==y) || (xP+1==x && yP==y) || (xP==x && yP+1==y) || (xP==x && yP-1==y) || (xP+1==x && yP-1==y) || (xP-1==x && yP+1==y)) && this.health > 0)
				health--;
			return health;
		}
		
		public int[][] update(int[][] map, ArrayList<Texture> text) 
		{	
			if(health > 0)
			{
			float xDistance = (float) (camera.getX()-xPos)-1;
			float yDistance = (float) (camera.getY()-yPos)-1;
			float hypotenuse = (float) Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));

			if(hypotenuse < 400)
			{
			        yPos += MOVE_SPEED*(yDistance/hypotenuse);
			        xPos += MOVE_SPEED*(xDistance/hypotenuse);
			}
			int[][] m = map;
			for(int x = 0; x < m.length; x++)
				for(int y = 0; y < m[x].length; y++)
					if(m[x][y] == 5)
						m[x][y] = 0;
			m[(int) xPos][(int) yPos] = 5;
			return m;
			}
			else
			{
				int[][] m = map;
				for(int x = 0; x < m.length; x++)
					for(int y = 0; y < m[x].length; y++)
						if(m[x][y] == 5)
							m[x][y] = 7;
				return map;
			}
		}

		public void win(int[][] map)
		{
			int[][] m = map;
			for(int x = 0; x < m.length; x++)
				for(int y = 0; y < m[x].length; y++)
					if(m[x][y] == 5)
						m[x][y] = 6;
		}
		
		public void damage(int x, int y, ArrayList<Texture> text)
		{
			int xP = (int)xPos;
			int yP = (int)yPos;
			if((xP==x && yP==y) || (xP-1==x && yP-1==y) || (xP+1==x && yP+1==y) || (xP-1==x && yP==y) || (xP+1==x && yP==y) || (xP==x && yP+1==y) || (xP==x && yP-1==y) || (xP+1==x && yP-1==y) || (xP-1==x && yP+1==y))
			{
				health--;
				Texture one = text.get(9);
				text.set(4, one);
			}
		}
		
		public double getY()
		{
			return yPos;
		}
		
		public double getX()
		{
			return xPos;
		}
		
		@Override
		public void keyTyped(KeyEvent e) 
		{
			// TODO Auto-generated method stub	
		}
	}
