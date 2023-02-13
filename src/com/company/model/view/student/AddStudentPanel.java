package com.company.model.view.student;

import com.company.model.Student;
import com.company.model.view.MainFrame;
import repository.StudentRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentPanel extends JPanel {
    public AddStudentPanel(){

    JTextField name = new JTextField(10);
    JTextField surname = new JTextField(10);
    JButton addStudentsButton = new JButton("Добавить");

        addStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!name.getText().isEmpty() && !surname.getText().isEmpty()) {
                    new Student(name.getText(), surname.getText());
                    StudentRepository.insert(name.getText(), surname.getText());
                    name.setText("");
                    surname.setText("");
                    MainFrame.addStudentFrame.setVisible(false);
                }
            }
        });

    add(name);
    add(surname);
    add(addStudentsButton);
    setVisible(true);
}}

