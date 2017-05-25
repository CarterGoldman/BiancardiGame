

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Camera implements KeyListener
{
	public double xPos, yPos, xDir, yDir, xPlane, yPlane;
	public boolean left, right, forward, back, attack;
	public final double MOVE_SPEED = .08;
	public final double ROTATION_SPEED = .045;
	public Texture tex;
	public int count = 0;
	public int mark = 0;
	
	public Camera(double x, double y, double xd, double yd, double xp, double yp) 
	{	
		xPos = x;
		yPos = y;
		xDir = xd;
		yDir = yd;
		xPlane = xp;
		yPlane = yp;
	}
	
	public void keyPressed(KeyEvent key) 
	{
		if((key.getKeyCode() == KeyEvent.VK_A))
			left = true;
		if((key.getKeyCode() == KeyEvent.VK_D))
			right = true;
		if((key.getKeyCode() == KeyEvent.VK_W))
			forward = true;
		if((key.getKeyCode() == KeyEvent.VK_S))
			back = true;
		if((key.getKeyCode() == KeyEvent.VK_SPACE))
			attack = true;
	}
	
	public void keyReleased(KeyEvent key)
	{
		if((key.getKeyCode() == KeyEvent.VK_A))
			left = false;
		if((key.getKeyCode() == KeyEvent.VK_D))
			right = false;
		if((key.getKeyCode() == KeyEvent.VK_W))
			forward = false;
		if((key.getKeyCode() == KeyEvent.VK_S))
			back = false;
		if((key.getKeyCode() == KeyEvent.VK_SPACE))
			attack = false;
	}
	
	public void update(int[][] map, Droid enemy, ArrayList<Texture> text) 
	{
		mark++;
		if(count == 0)
		{
			tex = text.get(4);
			count++;
		}
		if(mark > 10)
		{
			text.set(4, tex);
			mark = 0;
		}
		if(forward) 
		{
			if(map[(int)(xPos + xDir * MOVE_SPEED)][(int)yPos] == 0) 
			{
				xPos+=xDir*MOVE_SPEED;
			}
			if(map[(int)xPos][(int)(yPos + yDir * MOVE_SPEED)] ==0)
				yPos+=yDir*MOVE_SPEED;
		}
		if(back) 
		{
			if(map[(int)(xPos - xDir * MOVE_SPEED)][(int)yPos] == 0)
				xPos-=xDir*MOVE_SPEED;
			if(map[(int)xPos][(int)(yPos - yDir * MOVE_SPEED)]==0)
				yPos-=yDir*MOVE_SPEED;
		}
		if(right) 
		{
			double oldxDir=xDir;
			xDir=xDir*Math.cos(-ROTATION_SPEED) - yDir*Math.sin(-ROTATION_SPEED);
			yDir=oldxDir*Math.sin(-ROTATION_SPEED) + yDir*Math.cos(-ROTATION_SPEED);
			double oldxPlane = xPlane;
			xPlane=xPlane*Math.cos(-ROTATION_SPEED) - yPlane*Math.sin(-ROTATION_SPEED);
			yPlane=oldxPlane*Math.sin(-ROTATION_SPEED) + yPlane*Math.cos(-ROTATION_SPEED);
		}
		if(left)
		{
			double oldxDir=xDir;
			xDir=xDir*Math.cos(ROTATION_SPEED) - yDir*Math.sin(ROTATION_SPEED);
			yDir=oldxDir*Math.sin(ROTATION_SPEED) + yDir*Math.cos(ROTATION_SPEED);
			double oldxPlane = xPlane;
			xPlane=xPlane*Math.cos(ROTATION_SPEED) - yPlane*Math.sin(ROTATION_SPEED);
			yPlane=oldxPlane*Math.sin(ROTATION_SPEED) + yPlane*Math.cos(ROTATION_SPEED);
		}
		if(attack)
		{
			enemy.damage((int)xPos, (int)yPos, text);
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
