import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String surname;

    static String[] headers = {"ID", "Name", "Surname"};
    public static DefaultTableModel model = new DefaultTableModel(headers, 0);

    static ArrayList<Student> list = new ArrayList<>();
    private static int lastID = 0;

    public Student(String name, String surname) {
        this.id = ++lastID;
        this.name = name;
        this.surname = surname;
        list.add(this);
        addRow(this);
    }

    public static void addRow(Student student){
        model.addRow(
                new Object[] {
                        student.id,
                        student.name,
                        student.surname

                });
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.surname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static ArrayList<Student> getList() {
        return list;
    }

    public static void setList(ArrayList<Student> list) {
        Student.list = list;
    }

    public static int getLastID() {
        return lastID;
    }

    public static void setLastID(int lastID) {
        Student.lastID = lastID;
    }

    ArrayList<Course> getCourses() {
        return CourseEnrollment.getCoursesByStudent(this);
    }
    ArrayList<Integer> getMarks(Course course){
        return AcademicPerformance.getMarksByStudentAndCourse(this, course);
    }
    void getMarks(){
        System.out.println(this.name + " " + this.surname);
        for(Course course : this.getCourses()){
            System.out.println(course.getTitle() + " " + course.getDescription() + ": ");
            System.out.println(AcademicPerformance.getMarksByStudentAndCourse(this,course));
        }
    }
}
