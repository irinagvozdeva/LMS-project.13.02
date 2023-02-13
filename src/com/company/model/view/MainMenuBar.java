package com.company.model.view;

import com.company.model.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuBar extends JMenuBar {
    public MainMenuBar() {
        add(fileMenu());
        add(lists());
        add(helpMenu());
    }

    private JMenu fileMenu() {
        JMenu file = new JMenu("Файл");
        JMenu newItem = new JMenu("Новый");
        JMenuItem newStudent = new JMenuItem("Студент");
        JMenuItem newCourse = new JMenuItem("Курс");
        JMenuItem settings = new JMenuItem("Настройки");
        JMenuItem exit = new JMenuItem("Выйти");


        file.add(newItem);
        newItem.add(newStudent);
        newItem.add(newCourse);
        file.add(settings);
        file.add(exit);



        newStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.addStudentFrame.setVisible(true);
            }


        });
        newCourse.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                MainFrame.addCourseFrame.setVisible(true);
            }
        });
        return file;}

    private JMenu lists(){
        JMenu lists = new JMenu("Списки");
        JMenuItem students = new JMenuItem("Студенты");
        JMenuItem courses = new JMenuItem("Курсы");

        lists.add(courses);
        lists.add(students);

        courses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.remove(MainFrame.studentListPanel);
                Main.mainFrame.add(MainFrame.courseListPanel);
                Main.mainFrame.pack();
            }
        });

        students.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.remove(MainFrame.courseListPanel);
                Main.mainFrame.add(MainFrame.studentListPanel);
                Main.mainFrame.pack();
            }
        });
        return lists;

    }



        private JMenu helpMenu () {
            JMenu help = new JMenu("Помощь");
            JMenuItem aboutProgramme = new JMenuItem("О программе");
            JMenuItem reference = new JMenuItem("Справка");

            help.add(aboutProgramme);
            help.add(reference);
            return help;
        }
    }
