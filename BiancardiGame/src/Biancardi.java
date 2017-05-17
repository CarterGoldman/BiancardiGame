/*
 * Carter Cody
 * 
 */

public class Biancardi
{
	private int IQ;
	private double GPA;
	private String[] comments = {"Heck", "My name is Biancardi and I'm ready to frickin party", "My GPA is " + GPA, " so I'm smarter than you", "I have a " + IQ + " IQ so I am better than you", "My" + GPA + " GPA is okay"}
	
	public Biancardi()
	{
		IQ = 500;
		GPA = 5.0;
	}
	
	public String comment()
	{
		return comments[(int)Math.random()*comments.length];
	}
	
	public void bianparty()
	{
		
	}
}
