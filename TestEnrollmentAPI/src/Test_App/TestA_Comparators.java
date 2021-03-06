/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_App;

import PeterMartyr.Library.Models.Course;
import PeterMartyr.Library.Models.Enrollment;
import PeterMartyr.Library.Models.SortByCourseName;
import PeterMartyr.Library.Models.SortByStudentName;
import PeterMartyr.Library.Models.Student;
import Test_Stub.TestStub;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 001091501
 */
public class TestA_Comparators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestStub testStub = new TestStub();
        
        List<Student> students = testStub.getStudents();
        List<Course> courses = testStub.getCourses();
        List<Enrollment> enrollments = testStub.getEnrollments(0);
        
        System.out.println("========================");
        System.out.println("Lists=================");
        System.out.println("========================");

        //Before Sorting
        System.out.println("\nStudents Before Sorting===========================");
        for (Student student : students) {
            System.out.println(student.getStudentID() + " " + student.getName());
        }
        
        Collections.sort(students);
        
        System.out.println("\nSorted by ID");
        for (Student student : students) {
            System.out.println(student.getStudentID() + " " + student.getName());
        }
        
        Collections.sort(students, new SortByStudentName());
        
        System.out.println("\nSorted by name");
        for (Student student : students) {
            System.out.println(student.getStudentID() + " " + student.getName());
        }

        //Before Sorting
        System.out.println("\nCourses Before Sorting==========================");
        for (Course course : courses) {
            System.out.println(course.getCourseCode() + " " + course.getCourseName());
        }
        
        Collections.sort(courses);
        
        System.out.println("\nSorted by Course Code");
        for (Course course : courses) {
            System.out.println(course.getCourseCode() + " " + course.getCourseName());
        }
        
        Collections.sort(courses, new SortByCourseName());
        
        System.out.println("\nSorted by Course name");
        for (Course course : courses) {
            System.out.println(course.getCourseCode() + " " + course.getCourseName());
        }

        //Before Sorting
        System.out.println("\nEnrolments Before Sorting==========================");

//        System.out.println("Size " + students.get(0).getEnrollments().size());
//        System.out.println("Size " + enrollments.size());
        for (Enrollment enrolment : enrollments) {
            System.out.println(enrolment.getDateEnrolled().toString());
        }
        
        Collections.sort(enrollments);
        
        System.out.println("\nSorted by Date Enrolled");
        for (Enrollment enrolment : enrollments) {
            System.out.println(enrolment.getDateEnrolled());
        }
        
        System.out.println("\n========================");
        System.out.println("HashSets ===============");
        System.out.println("========================");
        
        HashSet<Course> courses_Set = new LinkedHashSet<>();
        
        courses_Set.add(new Course("5CEP", "Copyright and Ethics", 300.00));
        courses_Set.add(new Course("4JAB", "Java Basic", 600.00));
        courses_Set.add(new Course("4C#B", "C-Sharp Basic", 600.00));
        courses_Set.add(new Course("4HTML", "Web-page Design", 450.00));
        
        
        System.out.println("\nCourse name SET unsorted");
        for (Course course : courses_Set) {
            System.out.println(course.getCourseCode());
        }

        List<Course>courseList;
        courseList = new LinkedList<>();
        
        for (Course item : courses_Set) {
            courseList.add(item);
        }
        
        Collections.sort(courseList);
        
        courses_Set = new LinkedHashSet<>();
        for (Course item : courseList) {
            courses_Set.add(item);
        }
        
        System.out.println("\nCourse Code SET sorted by Code");
        for (Course course : courses_Set) {
            System.out.println(course.getCourseCode());
        }
        
        String message = "\n\nComment:: seriously there no support for HashSets Sorting? \n"
                + "        I need to turn it into a list that I already proved works and \n"
                + "         Then Sort IT (OMG) && (LMAO) hehehe,"
                + "        then turn it back into a HashSet??\n"
                + "        \n"
                + "         I am so done proving the obvious"
                + "         \n it is alot of work since it is unsupported";
        
        System.out.println(message);
        
        /*
         List<Student> students = testStub.getStudents();
        List<Course> courses = testStub.getCourses();
        List<Enrollment> enrollments = testStub.getEnrollments(0);
        */
        
        
        System.out.println("\nGeneric ToString  Student");
        for (Student ss : students) {
            System.out.println(ss);
        }
        
         System.out.println("\nGeneric ToString  course");
        for (Course ss : courses) {
            System.out.println(ss);
        }
        
          System.out.println("\nGeneric ToString  Enrollments");
        for (Enrollment ss : enrollments) {
            System.out.println(ss);
        }
        
    }
}
