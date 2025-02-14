package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary(String key)
    {
        System.out.println("Students: ");
        for (Student s: students.values()) {
                Student stud = students.get(key);
            System.out.println(s.toString());
        }
        //TODO implement
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}



//  System.out.println( "Available Courses:" );
//          for ( String key : courses.keySet() )
//          {
//          Course course = courses.get( key );
//          System.out.println( course );
//          }
//          System.out.println( "Enrolled Students" );
//          for ( String key : enrolledStudents.keySet() )
//          {
//          List<Student> students = enrolledStudents.get( key );
//        System.out.println( "Students on Course " + key + ": " );
//        for ( Student student : students )
//        {
//        System.out.println( student );
//        }
