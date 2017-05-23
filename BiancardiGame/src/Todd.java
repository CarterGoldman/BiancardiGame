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
	
	public String getQuestion()
	{
		return question;
	}
	
	public void setQuestion()
	{
		question = Question.generateQuestion();
	}
	
	public String answer(int questionNum)
	{
		switch(questionNum)
		{
		case 1:
			answer = " ";
			answer = "My ideal date would be Disney World or Epcot.";
		break;
		case 2:
			answer = " ";
			answer = "My GPA was 2.9";
		break;
		case 3:
			answer = " ";
			answer = "I spend around 1 hour";
		break;
		case 4:
			answer = " ";
			answer = "Never";
		break;
		case 5:
			answer = " ";
			answer = "No.";
		break;
		case 6:
			answer = " ";
			answer = "Often.";
		break;
		case 7:
			answer = " ";
			answer = "Programming.";
		break;
		case 8:
			answer = " ";
			answer = "All the time.";
		break;
		case 9:
			answer = " ";
			answer = "Never.";
		break;
		case 10:
			answer = " ";
			answer = "Terrible!";
		break;
		case 11:
			answer = " ";
			answer = "San Diego.";
		break;
		case 12:
			answer = " ";
			answer = " ";
		break;
		case 13:
			answer = " ";
			answer = "No spirit animal.";
		break;
		case 14:
			answer = " ";
			answer = "My computer.";
		break;
		case 15:
			answer = " ";
			answer = "Summer";
		break;
		case 16:
			answer = " ";
			answer = "PHP / mySQLI";
		break;
		case 17:
			answer = " ";
			answer = "None.";
		break;
		case 18:
			answer = " ";
			answer = "We are the Champions by Queen";
		break;
		case 19:
			answer = " ";
			answer = "Weekly";
		break;
		case 20:
			answer = " ";
			answer = "At Disney World";
		break;
		case 21:
			answer = " ";
			answer = "22 years old";
		break;
		case 22:
			answer = " ";
			answer = "Scorpio";
		break;
		case 23:
			answer = " ";
			answer = "Gold";
		break;
		case 24:
			answer = " ";
			answer = "Cars 1";
		break;
		case 25:
			answer = " ";
			answer = "Yes";
		break;
		case 26:
			answer = " ";
			answer = "To win the lottery";
		break;
		case 27:
			answer = " ";
			answer = "Go to Holland";
		break;
		case 28:
			answer = " ";
			answer = "'Weems'";
		break;
		case 29:
			answer = " ";
			answer = "Abe Lincoln, Kirby Puckett, and Nolan Ryan";
		break;
		case 30:
			answer = " ";
			answer = "'Hacking the Kinetic Chain'";
		break;
		case 31:
			answer = " ";
			answer = "Yell";
		break;
		case 32:
			answer = " ";
			answer = "Coming to LC everyday";
		break;
		case 33:
			answer = " ";
			answer = "Huh?";
		break;
		case 34:
			answer = " ";
			answer = "1, I don't know what that is";
		break;
		case 35:
			answer = " ";
			answer = "Never";
		break;
		case 36:
			answer = " ";
			answer = "Holland";
		break;
		case 37:
			answer = " ";
			answer = "This question stinks";
		break;
		case 38:
			answer = " ";
			answer = "Baseball Cards";
		break;
		case 39:
			answer = " ";
			answer = "You're an idiot";
		break;
		case 40:
			answer = " ";
			answer = "I have never seen a Pokemon.  I have no idea.";
		break;
		case 41:
			answer = " ";
			answer = "Yum-Yum's (my mom's dessert)";
		break;
		}
		return answer;
	}
	
	
}
