package view;

import model.Student;

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
            Student student = new Student(name.getText(), surname.getText());
            StudentListPanel.model.addRow(
                    new Object[] {
                            student.getId(),
                            student.getName(),
                            student.getSurname()

                    });
        }
    });

    add(name);
    add(surname);
    add(addStudentsButton);
    setVisible(true);
}}

