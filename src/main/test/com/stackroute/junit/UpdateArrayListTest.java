package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.UpdateArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList object;

    @Before
    public void setUp() throws Exception {
        object=new UpdateArrayList();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void testForGivenIndexAndStringReturnUpdatedString()
    {
        String s=object.ChangeListItems("kiwi",0,"Mango",2).toString();
        assertEquals("[kiwi, Grape, Mango, Berry]",s);
    }
    @Test
    public void testForGivenIndexOutOfBoundReturnError()
    {
        String s=object.ChangeListItems("kiwi",7,"Mango",8).toString();
        assertEquals("[ArrayIndexOutOfBoundException]",s);
    }
    @Test
    public void testForGivenOneIndexOutOfBoundReturnError()
    {
        String s=object.ChangeListItems("kiwi",0,"Mango",8).toString();
        assertEquals("[ArrayIndexOutOfBoundException]",s);
    }
}