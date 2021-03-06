import javax.swing.JOptionPane;

/*
 * Michael Mike Ricky
 * 
 */

public class Contestant<T> implements Comparable<T>
{
	private int points;
	private String name;
	private String answer;
	private String question;

	public Contestant(String name)
	{
		points = 0;
		this.name = name;
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
		answer = ans;
	}

	public String getQuestion()
	{
		setQuestion();
		return question;
	}

	public void setQuestion()
	{
		question = Question.generateQuestion();
	}

	@Override
	public int compareTo(T other)
	{
		if (other instanceof Contestant)
		{
			Contestant temp = (Contestant) other;
			if (this.getPoints() > temp.getPoints())
			{
				return 1;
			} else if (this.getPoints() == temp.getPoints())
			{
				return 0;
			} else
			{
				return -1;
			}
		}
		return (Integer) null;
	}
}
