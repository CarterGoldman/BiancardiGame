/*
 * Joe Gavin Charlie
 * 
 */

public class Self extends Contestant
{

	private String name;;
	private String[][] answers =
	{
			{ "the beach", "a candle lit dinner", "the back of a minivan", "a coffee shop" },
			{ "0.0 to 1.0", "1.0 to 2.0", "2.0 to 3.0", "3.0 or above" },
			{ "zero", "less than 2 hours", "less than 4 hours", "i code 24/7 babe ;)" },
			{ "what is a meme?", "twice a day or less", "more than twice a day", "all day every day" },
			{ "no", "yes", "i am a ging, but can't run", "i no ging, but can run a 2 hour marathon babe" },
			{ "...", "a talk a lot and i don't stop", "i talk somethimes dude", "idk when i need to" },
			{ "makingout under a tin roof", "programming", "it doesn't matter i never leave my house",
					"going outside and playing in the rain" },
			{ "i got my ti84 in my back pocket and i am not afriad to use it", "i am a robot, i do it in my head",
					"i don't math", "once in a while" },
			{ "i meme everyday", "i cant make meme", "this is a bad question",
					"i make them often, if they are steamy iwemies" },
			{ "fire", "moves like jagger", "white and nerdy", "whatever mike harmon is down for" },
			{ "hollywood", "gary", "the ocean", "on a farm" },
			{ "im ready, im ready, im ready", "did you try wumbo?", "is mayonnaise an istrument",
					"aye, aye captian" },
			{ "turtle", "peguin", "wolf", "doggo/pupper" },
			{ "water", "my cash", "my doggo", "a subway sandwich" },
			{ "spring", "summer", "autumn", "winter" },
			{ "binary", "java", "c++", "scratch" },
			{ "stack overflow", "what's java?", "only on tuesdays",
					"an hour of coding a day keeps the females away" },
			{ "all-star", "all the small things", "back to me", "wrecking ball" },
			{ "only when i’m by myself", "every day", "never", "sometimes" },
			{ "at an expensive restaurant", "over xbox", "cringey", "in my musty basement" },
			{ "last year", "never", "i was kicked out", "you’re supposed to do that?" },
			{ "i know my sign", "i don’t know my sign", "what sign?", "yes" },
			{ "blue", "red", "pink", "can you repeat the question?" },
			{ "dragon ball z", "naruto", "sailor moon", "black lagoon" },
			{ "none", "i lost count", "3", "1" },
			{ "implements romance", "ap testing", "a fling", "world war 3" },
			{ "you", "get a 5 on the ap test", "eat the worlds hottest pepper", "work at microsoft" },
			{ "slick willy", "biggy smallz", "xxx_snakekid_xx_x33245", "joe" },
			{ "the founding fathers", "the computer teachers", "the sophomores in apcs", "zz top" },
			{ "the comunist manifesto", "the bable", "java methods third ap edition", "the magic treehouse" },
			{ "write code", "speak perfect german", "go on reddit", "think about my excelent gpa" },
			{ "my  roblox girlfriend", "making a good senior prank", "ap computer science", "playing the bass" },
			{ "yes", "no", "maybe", "i got it from joe" },
			{ " 1", " 5", " 10", " 11" },
			{ "once a day", "never", "once in a while", "i never stop dancing" },
			{ "the computer lab", "paris", "soviet russia", "my basement" },
			{ "jesus, my lord and savior", "gad", "muhammed", "i’m an atheist" },
			{ "memes", "stamps", "finger spinners", "phone cases" },
			{ "pepe", "steamy iwemies", "memes by Dallon Jones", "dat boi" },
			{ "pikachu", "charmander", "squirtle", "eevee" },
			{ "pizza", "lasagna", "chicken alfredo", "pb and j" } }

	;

	public Self()
	{
		super("Player 1");
	}

	public String[] getAnswers(int questNum)
	{
		String[] output = new String[4];
		for (int x = 0; x < 4; x++)
		{
			output[x] = answers[questNum - 1][x];
		}
		return output;
	}

	public String getName()
	{
		return "Player 1";
	}

	public static int getIQ()
	{
		return (int) (Math.random() * 100 + 60);
	}

	public static double getGPA()
	{
		if (getIQ() < 80)
			return 1.0;
		else if (getIQ() < 100)
			return 2.5;
		else if (getIQ() < 120)
			return 3.0;
		else if (getIQ() < 140)
			return 4.0;
		else
			return 4.78;
	}
}
