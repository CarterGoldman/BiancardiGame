/*
 * Michael Mike Ricky
 * 
 */

public class Contestant 
{
	private int points;
	private String name;
	private int height;
	private int weight;
	private int IQ;
	private double GPA;
	
	
	public Contestant(int p, String nam, int h,int w, int iq, double gpa)
	{
		points = p;
		name = nam;
		height = h;
		weight = w;
		IQ = iq;
		GPA = gpa;
	}
	
	public Contestant()
	{
		points = 0;
		name = "";
		height = 0;
		weight = 0;
		IQ = 0;
		GPA = 0;
	}
	
	public void addPoints(int p)
	{
		points += p;
	}
}
