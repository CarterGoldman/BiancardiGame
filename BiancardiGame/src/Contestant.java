import javax.swing.JOptionPane;

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
	
	public void addPoints(int amount)
	{
		points += amount;
	}
	
	public void getQuestion()
	{
		Question question = new Question();
		String quest = question.generateQuestion();
		
	}
	
	public void askQuestion()
	{
		//output question
		
		//assign answer to ans
		String ans;
	}
	
	public void decidePoints(String ans)
	{
		//determine points earned from answer
	}

	
}
