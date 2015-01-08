import java.util.Random;


public class PhraseModifier{
	Random rnd = new Random();
	int youreChance = 5;
	int yourChance = 5;
	int uChance = 5;
	int iChance = 5;
	public String getPhrase(Phrase phrase)
	{
		String str = phrase.getPhrase();
		int chance = 5;
		if(rnd.nextInt(chance) == 0)
		{
			str.replace("you are", "you're");
		}
		else if(rnd.nextInt(chance) == 1)
		{
			str.replace("you are", "your");
		}
		chance = 5;
		if(rnd.nextInt(chance) == 0)
		{
			str.replace("you", "u");
		}
		chance = 5;
		if(rnd.nextInt(chance) == 0)
		{
			str.replace("I", "i");
		}
		chance = 5;
		if(rnd.nextInt(chance) == 0)
		{
			str.replace("I", "i");
		}
		chance = 5;
		if(rnd.nextInt(chance) == 0)
		{
			str.toUpperCase();
		}
		return str;
		
	}
}
