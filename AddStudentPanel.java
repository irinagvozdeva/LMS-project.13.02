import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addStudentPanel {
    public addStudentPanel(){

    JTextField name = new JTextField(10);
    JTextField surname = new JTextField(10);
    JButton addStudentsButton = new JButton("Добавить");
           addStudentsButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Student student = new Student(name.getText(), surname.getText());
            frame.setTitle(String.valueOf(student));
        }
    });

           add(name);
           add(surname);
           add(addStudentButton);
           setVisible(true);
}}
