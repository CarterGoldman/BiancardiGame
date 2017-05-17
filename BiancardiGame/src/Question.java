
public class Question 
{
	private int point;
	private int pointTotal;
	private static String question;
	private static int questionNumber;
	public Question()
	{
		
		point = 0;
		pointTotal = 0;
		questionNumber = 1;
		question = "";
	}
	
	public String generateQuestion()
	{
		//get each question
		switch(questionNumber)
		{
			case 1:
				question = "What's your ideal date?";
				break;
			case 2:
				question = "How high is your GPA?";
				break;
			case 3:
				question = "How many hours do you spend a day programming?";
				break;
			case 4:
				question = "How often do you regularly search the internet for memes?";
				break;
			case 5:
				question = "Are you a redhead who likes to run?";
				break;
			case 6:
				question = "How much do you talk?";
				break;
			case 7:
				question = "What's your favorite way to spend a rainy day?";
				break;
			case 8:
				question = "How often do you carry around your calculator?";
				break;
			case 9:
				question = "How often do you make your own memes?";
				break;
			case 10:
				question = "How would you classify your dance moves?";
				break;
			case 11:
				question = "Where would you like to live if you could choose your ideal place?";
				break;
			case 12:
				question = "What's your favorite SpongeBob quote?";
				break;
			case 13:
				question = "";
				break;
			case 14:
				question = "";
				break;
			case 15:
				question = "";
				break;
		}	//end switch
		questionNumber++;	//increment question number for next call
		return question;
	}
	
	public int assignPointTotals(int answer)	//assign point totals for each answer
	{
		switch(questionNumber)
		{
			case 1:
			{
				if(answer == 1)
					point = 4;
				else if(answer == 2)
					point = -1;
				else if(answer == 3)
					point = 2;
				else
					
				
		}
	}
}
