package view;

import model.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCoursePanel extends JPanel {
    public AddCoursePanel(){

        JTextField title = new JTextField(10);
        JTextField description = new JTextField(10);
        JButton addCourseButton = new JButton("Добавить");

        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!title.getText().isEmpty() && !description.getText().isEmpty()) {
                    new Student(title.getText(), description.getText());
                    title.setText("");
                    description.setText("");
                }
            }
        });

        add(title);
        add(description);
        add(addCourseButton);
        setVisible(true);
    }}
