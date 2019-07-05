package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.setInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class setInterfaceTest {
    setInterface object;



        String str = "Harry Olive Alice Bluto Eugene";
        String str1 = "Harry Olive Alice Bluto";
        Set<String> set = new TreeSet<String>();

        {
            set.add("Alice");
            set.add("Bluto");
            set.add("Eugene");
            set.add("Harry");
            set.add("Olive");
        }
    @Before
    public void setUp() throws Exception {
        object=new setInterface();
    }

    @After
    public void tearDown() throws Exception
    {
        object=null;
    }
        @Test
        public void setInterfaceSuccess() {
            assertEquals(set, object.setInterface(str));

        }

        @Test
        public void setInterfaceFailure() {
            assertNotEquals(set, object.setInterface(str1));

        }
}