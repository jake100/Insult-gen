import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Generator {

	private ArrayList<Phrase> insults = new ArrayList<Phrase>();
	Random rnd = new Random();
	public void generate(HashMap<String, String> info)
	{
		if(info.containsKey("name"))
		{
			HashMap<String, String> insultMap = new HashMap<String, String>();
			String name = info.get("name");
			insultMap.put("name", name);
			insultMap = isA(insultMap, info);
			insults.add(new Phrase(insultMap , "#name is a #is_a"));
			insults.add(new Phrase(insultMap , "#name!"));
		}
		HashMap<String, String> insultMap = new HashMap<String, String>();
		insultMap = isA(insultMap, info);
		
		insults.add(new Phrase(insultMap , "you are a #is_a"));
		insults.add(new Phrase(insultMap , "#is_a"));
		insults.add(new Phrase(insultMap , "#you did_a"));
		insults.add(new Phrase(insultMap , "#did_a!"));
		insults.add(new Phrase(insultMap , "#you did_a you #is_a"));
		
	}
	private HashMap<String, String> didA(HashMap<String, String> insultMap, HashMap<String, String> info)
	{
		if(info.containsKey("sucks dick"))
		{
			int choice = rnd.nextInt(2);
			switch(choice)
			{
			case 0:
				insultMap.put("did_a", "sucked dick");
				break;
			case 1:
				insultMap.put("did_a", "sucks dick");
				break;
			}
		}
		if(info.containsKey("is a slut"))
		{
			int choice = rnd.nextInt(2);
			switch(choice)
			{
			case 0:
				insultMap.put("did_a", "fucked everyone");
				break;
			case 1:
				insultMap.put("did_a", "fucking is slutty");
				break;
			case 2:
				insultMap.put("did_a", "fucked some dudes");
				break;
			}
		}
		if(info.containsKey("gives anal"))
		{
			int choice = rnd.nextInt(3);
			switch(choice)
			{
			case 0:
				insultMap.put("did_a", "fucked a dude in the ass");
				break;
			case 1:
				insultMap.put("did_a", "gave anal");
				break;
			case 2:
				insultMap.put("did_a", "fucked an asshole");
				break;
			}
		}
		if(info.containsKey("receives anal"))
		{
			int choice = rnd.nextInt(2);
			switch(choice)
			{
			case 0:
				insultMap.put("did_a", "took it in the ass");
				break;
			case 1:
				insultMap.put("did_a", "got rammed");
				break;
			case 2:
				insultMap.put("did_a", "got his poo pushed");
				break;
			case 3:
				insultMap.put("did_a", "got probed");
				break;
			}
		}
		if(info.containsKey("is a prude"))
		{
			int choice = rnd.nextInt(2);
			switch(choice)
			{
			case 0:
				insultMap.put("did_a", "fucked me");
				break;
			case 1:
				insultMap.put("did_a", "sucked my dick");
				break;
			case 2:
				insultMap.put("did_a", "is a slut");
				break;
			case 3:
				insultMap.put("did_a", "has great tits");
				break;
			}
		}
		return insultMap;
	}
	private HashMap<String, String> isA(HashMap<String, String> insultMap, HashMap<String, String> info)
	{
		if(info.containsKey("gender"))
		{
			String gender = info.get("gender");
			if(gender.equals("male"))
			{
				int choice = rnd.nextInt(9);
				switch(choice)
				{
				case 0:
					insultMap.put("is_a", "asshole");
					break;
				case 1:
					insultMap.put("is_a", "prick");
					break;
				case 2:
					insultMap.put("is_a", "faggot");
					break;
				case 3:
					insultMap.put("is_a", "douche");
					break;
				case 4:
					insultMap.put("is_a", "fag");
					break;
				case 5:
					insultMap.put("is_a", "douchebag");
					break;
				case 6:
					insultMap.put("is_a", "cock sucker");
					break;
				case 7:
					insultMap.put("is_a", "mother fucker");
					break;
				case 8:
					insultMap = generalInsult(insultMap, info);
					break;
				}
			}
			else if(gender.equals("female"))
			{
				int choice = rnd.nextInt(9);
				switch(choice)
				{
				case 0:
					insultMap.put("is_a", "whore");
					break;
				case 1:
					insultMap.put("is_a", "bitch");
					break;
				case 2:
					insultMap.put("is_a", "cunt");
					break;
				case 3:
					insultMap.put("is_a", "big tits");
					break;
				case 4:
					insultMap.put("is_a", "dike");
					break;
				case 5:
					insultMap.put("is_a", "lesbian");
					break;
				case 6:
					insultMap.put("is_a", "cock sucker");
					break;
				case 7:
					insultMap.put("is_a", "saggy tits");
					break;
				case 8:
					insultMap = generalInsult(insultMap, info);
					break;
				}
			}
			else
			{
				int choice = rnd.nextInt(9);
				switch(choice)
				{
				case 0:
					insultMap.put("is_a", "tranny");
					break;
				case 1:
					insultMap.put("is_a", "???");
					break;
				case 2:
					insultMap.put("is_a", "hermaphrodite");
					break;
				case 3:
					insultMap.put("is_a", "shemale");
					break;
				case 4:
					insultMap.put("is_a", "he-she");
					break;
				case 5:
					insultMap.put("is_a", "trans");
					break;
				case 6:
					insultMap.put("is_a", "transvestite");
					break;
				case 7:
					insultMap.put("is_a", "girlboy");
					break;
				case 8:
					insultMap = generalInsult(insultMap, info);
					break;
				}
			}
		}
		return insultMap;
	}
	private HashMap<String, String> generalInsult(HashMap<String, String> insultMap, HashMap<String, String> info)
	{
		if(insultMap.containsKey("is black") && rnd.nextBoolean())
		{
			int choice = rnd.nextInt(8);
			switch(choice)
			{
			case 0:
				insultMap.put("is_a", "niger");
				break;
			case 1:
				insultMap.put("is_a", "spear chucker");
				break;
			case 2:
				insultMap.put("is_a", "niglet");
				break;
			case 3:
				insultMap.put("is_a", "nig");
				break;
			case 4:
				insultMap.put("is_a", "n word");
				break;
			}
		}
		else
		{
			int choice = rnd.nextInt(8);
			switch(choice)
			{
			case 0:
				insultMap.put("is_a", "idiot");
				break;
			case 1:
				insultMap.put("is_a", "dumbass");
				break;
			case 2:
				insultMap.put("is_a", "moron");
				break;
			case 3:
				insultMap.put("is_a", "retard");
				break;
			case 4:
				insultMap.put("is_a", "fucktard");
				break;
			case 5:
				insultMap.put("is_a", "shithead");
				break;
			case 6:
				insultMap.put("is_a", "poohead");
				break;
			case 7:
				insultMap.put("is_a", "dummy");
				break;
			}
		}
		return insultMap;
	}
}
