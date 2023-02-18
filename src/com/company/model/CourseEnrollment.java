package com.company.model;

import repository.EnrollmentRepository;

import java.util.ArrayList;

public class CourseEnrollment {
    private int id;
    private Student student;
    private Course course;

    static ArrayList<CourseEnrollment> list = new ArrayList<>();

    private static int lastID;

    public CourseEnrollment(Student student, Course course) {
        System.out.println("Произошло зачисление");
        this.id = ++lastID;
        this.student = student;
        this.course = course;
        list.add(this);
        EnrollmentRepository.insertEnrollment(student.getId(), course.getId());
    }

    public CourseEnrollment(int id, Student student, Course course){
        this.id = id;
        this.student = student;
        this.course = course;
        list.add(this);
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public static ArrayList<CourseEnrollment> getList() {
        return list;
    }

    public static int getLastID() {
        return lastID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static void setList(ArrayList<CourseEnrollment> list) {
        CourseEnrollment.list = list;
    }

    public static void setLastID(int lastID) {
        CourseEnrollment.lastID = lastID;
    }

    static ArrayList<Course> getCoursesByStudent(Student student) {
        ArrayList<Course> courses = new ArrayList<>();
        for (CourseEnrollment courseEnrollment : list) {
            if (student.getId() == courseEnrollment.student.getId()) {
                courses.add(courseEnrollment.course);
            }
        }
    return courses;
    }
    static ArrayList<Student> getStudentByCourse(Course course){
        ArrayList<Student> students = new ArrayList<>();
        for(CourseEnrollment courseEnrollment : list){
            if(course.getId() == courseEnrollment.course.getId()){
               students.add(courseEnrollment.student);
            }
        }
        return students;
    }
    static CourseEnrollment getCourseEnrollment(Student student, Course course){
        for (CourseEnrollment ce : list) {
            if(ce.student == student && ce.course == course){
                return ce;
            }
        }
        return new CourseEnrollment(student, course);
    }
}






