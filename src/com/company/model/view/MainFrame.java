package com.company.model.view;

import com.company.model.view.course.AddCourseFrame;
import com.company.model.view.course.CourseListPanel;
import com.company.model.view.student.AddStudentFrame;
import com.company.model.view.student.StudentListPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public static AddStudentFrame addStudentFrame = new AddStudentFrame();
    public static AddCourseFrame addCourseFrame = new AddCourseFrame();
    public static StudentListPanel studentListPanel = new StudentListPanel();
    public static CourseListPanel courseListPanel = new CourseListPanel();
    public MainFrame(){
        setTitle("LMS");
        setSize(500,500);
        setLocation(300,300);
        setLayout(new FlowLayout());
        setJMenuBar(new MainMenuBar());
        add(courseListPanel);

        setVisible(true);
    }
}
