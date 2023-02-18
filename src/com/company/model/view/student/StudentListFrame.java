package com.company.model.view.student;

import com.company.model.Course;
import com.company.model.Student;

import javax.swing.*;
import java.awt.*;

public class StudentListFrame extends JFrame {
    public StudentListFrame(Course course){
        setTitle("Студенты курса");
        setLocation(300,300);
        setSize(600,600);
        setLayout(new FlowLayout());

        JTable table = new JTable();
        table.setModel(Student.getModelStudent(course));

        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        setVisible(true);
        pack();
    }
}
