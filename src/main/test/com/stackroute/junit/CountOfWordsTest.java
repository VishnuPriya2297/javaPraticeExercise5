package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.CountOfWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class CountOfWordsTest {
    CountOfWords object;
    Map<String, Integer> actualResult = new TreeMap<>();
    Map<String, Integer> expectedResult = new TreeMap<>();
    @Before
    public void setUp() throws Exception {
    object=new CountOfWords();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void givenStringReturnsMapWithCounts() {
        actualResult = object.countOfWords("one one -one___two,,three,one @three+one?two");
        expectedResult.put("one", 5);
        expectedResult.put("two", 2);
        expectedResult.put("three", 2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsCountOneForEveryWord() {
        actualResult = object.countOfWords("@three+one?two");
        expectedResult.put("one", 1);
        expectedResult.put("two", 1);
        expectedResult.put("three", 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullStringReturnsEmptyMap() {
        actualResult = object.countOfWords("");
        assertEquals(expectedResult, actualResult);
    }


}