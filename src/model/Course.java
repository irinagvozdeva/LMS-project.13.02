import java.util.ArrayList;

public class Course {
    private int id;
   private String title;
   private String description;

    static ArrayList<Course> list = new ArrayList<>();
    private static int lastID = 0;

    public Course(String title, String description) {
        this.id = ++lastID;
        this.title = title;
        this.description = description;
        list.add(this);
    }
    public String toString(){
        return this.id + " " + this.title + " " + this.description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Course> getList() {
        return list;
    }

    public static void setList(ArrayList<Course> list) {
        Course.list = list;
    }

    public static int getLastID() {
        return lastID;
    }

    public static void setLastID(int lastID) {
        Course.lastID = lastID;
    }
    ArrayList<Student> getStudent(){
        return CourseEnrollment.getStudentByCourse(this);}
}
