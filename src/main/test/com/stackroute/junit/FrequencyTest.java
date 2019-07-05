package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.Frequency;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyTest {
    Frequency object;
    String[] str={"a","b","c","d","a","c","c"};
    String[] str1={"a","b","c","d"};
    String[] str2={};
    Map<String,Boolean> expected=new HashMap<>();

    {
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
    }

    @Before
    public void setUp() throws Exception {
        object=new Frequency();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void testForGivenstringReturnOccuranceOfCharecters()
    {
        Map<String, Boolean> actual = new HashMap<>(object.findTheFrequency(str));

        assertEquals(expected, actual);
    }
    @Test
    public void testForGivenstringReturnError()
    {
        Map<String, Boolean> actual = new HashMap<>(object.findTheFrequency(str1));

        assertNotEquals(expected, actual);
    }
    @Test
    public void testForGivenNullStringReturnNull()
    {

        Map<String, Boolean> actual = new HashMap<>();
        actual=object.findTheFrequency(str2);
        Map<String,Boolean> expectedResult=null;
        assertEquals(expectedResult, actual);
    }
}