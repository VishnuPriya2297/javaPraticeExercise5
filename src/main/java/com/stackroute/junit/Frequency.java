package main.java.com.stackroute.junit;
/*
program to check the ocuurance of a string and returing true if occurs moe than once else false.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    public Map<String,Boolean> findTheFrequency(String[] inputArray)
    {
        Map<String,Boolean> checkForOccurance=new HashMap<>();
        if(inputArray.length==0)//if an empty string is passed then null is returned
        {
            return null;
        }
         for(int i=0;i<inputArray.length;i++)
        {
        if(checkForOccurance.containsKey(inputArray[i]))
        {
            checkForOccurance.put(inputArray[i],true);//for the later occurances chnging the value to true
        }
        else
            checkForOccurance.put(inputArray[i],false);//for the first occurance putting it into the map and making it false


        }
    return checkForOccurance;
    }
}
