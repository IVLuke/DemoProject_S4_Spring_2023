package com.keyin.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseAdmin {
    private Map<Student, List<Course>> studentToCourse = new HashMap<Student,List<Course>>();

     public void addCourseToStudent(Student student, Course course){
         List<Course> courseList = studentToCourse.get(student);

         if (courseList == null){
             courseList = new ArrayList<Course>();
             studentToCourse.put(student,courseList);
         }
         courseList.add(course);
     }
     public List<Course> getCourseListByStudent(Student student){
         return studentToCourse.get(student);
     }
}
