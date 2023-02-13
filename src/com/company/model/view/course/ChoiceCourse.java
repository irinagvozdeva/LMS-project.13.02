package com.company.model.view.course;
import com.company.model.Course;
import com.company.model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceCourse extends JFrame {
    CourseListPanel panel;
    public ChoiceCourse(Student student) {
        setTitle("Выбор курса");
        setLocation(300,300);
        setSize(600,600);
        setLayout(new FlowLayout());
        panel = new CourseListPanel();
        add(panel);

        JButton button = new JButton("Зачислить");
        add(button);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = panel.table.getSelectedRow();
                int courseID = Integer.parseInt(panel.table.getValueAt(index,0).toString());
                student.addCourse(Course.getCourseById(courseID));

            }
        });
    }
}
