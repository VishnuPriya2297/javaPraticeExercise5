package main.java.com.stackroute.junit;
/*
program to implement set interface and sort random words in ascending order.
 */
import java.util.Set;
import java.util.TreeSet;

public class setInterface {
    public Set<String> setInterface(String str)
    {
        String[] arr=str.split(" ");
        Set<String> st=new TreeSet<String>();

        for(String s:arr)
        {
            st.add(s);
        }

        return st;
    }
}
