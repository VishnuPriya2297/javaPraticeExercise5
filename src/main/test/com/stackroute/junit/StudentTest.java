package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.Student;
import main.java.com.stackroute.junit.StudentSorter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
Student object;
    @Before
    public void setUp() throws Exception {
    object=new Student();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
   public void givenInputStudentObjectReturnSortedOrderOfListOfStudents()
    {
        List<Student> actualList= new ArrayList<>();
        actualList.add(new Student(13,"sowmya",23));
        actualList.add(new Student(34,"lavanya",24));
        actualList.add(new Student(21,"pallavi",21));
        actualList.add(new Student(15,"bellam",22));
        actualList.add(new Student(32,"dimpu",20));
        Collections.sort(actualList,new StudentSorter());
        Collections.reverse(actualList);
        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(34,"lavanya",24));
        expectedList.add(new Student(13,"sowmya",23));
        expectedList.add(new Student(15,"bellam",22));
        expectedList.add(new Student(21,"pallavi",21));
        expectedList.add(new Student(32,"dimpu",20));
        Assert.assertEquals(expectedList.toString(),actualList.toString());
    }
    @Test
    public void givenInputStudentObjectsWithSameAgeReturnSortedOrderOfListOfStudents()
    {
        List<Student> actualList= new ArrayList<>();
        actualList.add(new Student(13,"sowmya",21));
        actualList.add(new Student(34,"lavanya",22));
        actualList.add(new Student(21,"pallavi",21));
        actualList.add(new Student(15,"bellam",22));
        actualList.add(new Student(32,"dimpu",20));
        Collections.sort(actualList,new StudentSorter());
        Collections.reverse(actualList);
        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(34,"lavanya",22));
        expectedList.add(new Student(15,"bellam",22));
        expectedList.add(new Student(13,"sowmya",21));
        expectedList.add(new Student(21,"pallavi",21));
        expectedList.add(new Student(32,"dimpu",20));
        Assert.assertEquals(expectedList.toString(),actualList.toString());
    }
    @Test
    public void givenInputStudentObjectsWithSameAgeAndSameNameReturnSortedOrderOfListOfStudents()
    {
        List<Student> actualList= new ArrayList<>();
        actualList.add(new Student(13,"sowmya",21));
        actualList.add(new Student(34,"lavanya",22));
        actualList.add(new Student(21,"sowmya",21));
        actualList.add(new Student(15,"lavanya",22));
        actualList.add(new Student(32,"dimpu",20));
        Collections.sort(actualList,new StudentSorter());
        Collections.reverse(actualList);
        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(34,"lavanya",22));
        expectedList.add(new Student(15,"lavanya",22));
        expectedList.add(new Student(21,"sowmya",21));
        expectedList.add(new Student(13,"sowmya",21));
        expectedList.add(new Student(32,"dimpu",20));
        Assert.assertEquals(expectedList.toString(),actualList.toString());
    }


}