package main.java.com.stackroute.junit;
/*
create a sudent class that contains the name id age of a student
 */

public class Student {
    int studentId;
    String studentName;
     int studentAge;
   public Student()
     {

     }
   public Student(int studentId,String studentName,int studentAge)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAge=studentAge;
    }
//Implementing getter and setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" +studentId+
                ", studentName='" +studentName+ '\'' +
                ", studentAge="+studentAge+
                '}';
    }
}
