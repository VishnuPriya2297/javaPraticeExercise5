package main.java.com.stackroute.junit;
/*
program to replace the frst value of the map with null and storing the first value into the second.
 */

import java.util.*;

public class ReplaceFirstValue
{
    public Map<String,String> replaceFirstValue(Map<String,String> inputmapList)
    {
        Iterator iterator = inputmapList.entrySet().iterator();//object for iterator
        if (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String word = " ";

            if (!inputmapList.get("val1").equals(" ")) {
                word = (String) entry.getValue();//storing the first value in a temporary variable
                inputmapList.put("val1", " ");//changing to empty string
            }
            Map.Entry presentEntry = (Map.Entry) iterator.next();
            if (word != null)
                presentEntry.setValue(word);//updating the second value using the temporary variable word.

        }
        return inputmapList;
    }
}