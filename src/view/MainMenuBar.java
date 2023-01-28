import javax.swing.*;

public class MainMenuBar extends JMenuBar {
    public MainMenuBar(){
      add(fileMenu());
      add(helpMenu());
    }

    private JMenu fileMenu(){
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
        return file;
    }
    private JMenu helpMenu(){
        JMenu help = new JMenu("Помощь");
        JMenuItem aboutProgramme = new JMenuItem("О программе");
        JMenuItem reference = new JMenuItem("Справка");

        help.add(aboutProgramme);
        help.add(reference);
        return help;
    }
}
