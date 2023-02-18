package com.company.model.view.course;


import com.company.model.Course;
import com.company.model.Student;
import com.company.model.view.student.StudentListFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseJPopUpMenu extends JPopupMenu {
    static MenuItemListener menuItemListener = new MenuItemListener();
    public static JTable table;
    public CourseJPopUpMenu(JTable table){
        this.table = table;
        add(createItem("Сохранить", "save"));
        add(createItem("Удалить", "delete"));
        add(createItem("Показать студентов", "showStudents"));
    }
    JMenuItem createItem(String title, String command){
        JMenuItem item = new JMenuItem(title);
        item.setActionCommand(command);
        item.addActionListener(menuItemListener);
        return item;
    }
    static class MenuItemListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = table.getSelectedRow();
            int id = Integer.parseInt(table.getValueAt(index,0).toString());
            String title = table.getValueAt(index, 1).toString();
            String description = table.getValueAt(index, 2).toString();

            switch (e.getActionCommand()) {
                case "save" -> Course.update(id, index, title, description);
                case "delete" -> Course.delete(id, index);
                case "showStudents" -> new StudentListFrame(Course.getCourseById(id));
                default -> System.err.println("Не удалось обработать команду");
            }

        }
    }
}