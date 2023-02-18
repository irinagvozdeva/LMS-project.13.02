package com.company.model.view.course;

import com.company.model.Course;
import com.company.model.Student;

import javax.swing.*;
import java.awt.*;

public class CourseListFrame extends JFrame {
    public CourseListFrame(Student student){
        setTitle("Курсы студента");
        setLocation(300,300);
        setSize(600,600);
        setLayout(new FlowLayout());

        JTable table = new JTable();
        table.setModel(Course.getModelCourse(student));

        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        setVisible(true);
        pack();
    }
}
