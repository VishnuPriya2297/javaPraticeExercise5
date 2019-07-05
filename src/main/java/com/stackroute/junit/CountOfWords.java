package main.java.com.stackroute.junit;
/*
program to count the occurance of each charecter in a string
 */
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfWords {
public Map<String,Integer> countOfWords(String inputString)
{
    Map<String,Integer> stringOfIntegers=new TreeMap<>();
    Pattern pattern =Pattern.compile("one|two|three");//generating the pattern
    Matcher matcher=pattern.matcher(inputString);//matching the input string with the given pattern
    while(matcher.find())
    {
        String foundWord = matcher.group();
        if(!stringOfIntegers.containsKey(foundWord))//if the word in not found putting it into the map
        {
            stringOfIntegers.put(foundWord, 1);
        }
        else
        {
            stringOfIntegers.put(foundWord, stringOfIntegers.get(foundWord)+1);//increasing the count
        }
    }
    return stringOfIntegers;
}
}
