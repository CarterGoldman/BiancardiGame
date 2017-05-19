/*
 * Aerone Ian
 * 
 */
public class Todd extends Contestant
{
	private int points;
	private String name;
	private String answer;
	private String question;
	
	public Todd(String name)
	{
		super(name);
	}
	
	public void addPoints(int amount)
	{
		points += amount;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAnswer()
	{
		return answer;
	}
	
	public void setAnswer(String ans)
	{
		this.answer = ans;
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	public void setQuestion()
	{
		Question quest = new Question();
		question = quest.generateQuestion();
	}
	
	
}
