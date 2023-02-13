package com.company.model.view.course;

import javax.swing.*;
import java.awt.*;

public class AddCourseFrame extends JFrame {
    public AddCourseFrame(){
        setTitle("Создание нового курса");
        setSize(500,300);
        setLocation(710,390);
        setLayout(new FlowLayout());
        add(new AddCoursePanel());

        setVisible(false);

    }
}
