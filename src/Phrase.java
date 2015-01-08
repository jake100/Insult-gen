import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Phrase {
	private HashMap<String, String> map;
	private String str;
	public Phrase(HashMap<String, String> map, String str)
	{
		this.map = map;
		this.str = str;
		
	}
	public String getPhrase()
	{
		String newStr = str;
	   	Pattern pattern = Pattern.compile("#//w");
    	Matcher matcher = pattern.matcher(str); 
    	while(matcher.find())
    	{
    		newStr.replace(matcher.group(), map.get(matcher.group().substring(1, matcher.group().length())));
    	}
		return newStr;
	}
}
