package main.java.com.stackroute.junit;
/*
program to replace a particular item in an ArrayList
 */
import java.util.ArrayList;

public class UpdateArrayList {
    public ArrayList<String> ChangeListItems(String changedInput1 ,int index1,String changedInput2,int index2)
    {
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<String> catchingException = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        int length=list.size();
        ArrayList<String> replacedString=new ArrayList<String>(list);//changing the list items using their indexes and set() method
        try
        {
            replacedString.set(index1, changedInput1);
            replacedString.set(index2, changedInput2);
            return replacedString;
        }
        catch (IndexOutOfBoundsException ae)//if the index is greater than the size of the array list then raising an exception
        {
            catchingException.add("ArrayIndexOutOfBoundException");
        }
return catchingException;
    }
}
