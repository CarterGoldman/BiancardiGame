/*
 * Carter Cody
 * 
 */

public class Biancardi
{
	private int IQ;
	private double GPA;
	private Question questions;
	
	public Biancardi()
	{
		IQ = 500;
		GPA = 5.0;
		questions = new Question();
	}
	
	public String askNextQuestion()
	{
		return questions.generateQuestion();
	}
}
