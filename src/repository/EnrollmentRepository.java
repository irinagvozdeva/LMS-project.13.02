package repository;

import com.company.model.Course;
import com.company.model.CourseEnrollment;
import com.company.model.Student;

import java.sql.*;

public class EnrollmentRepository {
    public static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String login = "postgres";
    private static String password = "123";

    public static void getAll() {

        String query = "Select * from enrollments";
        try {
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String studentId = resultSet.getString("studentid");
                String courseId = resultSet.getString("courseid");
            //    new CourseEnrollment(Integer.parseInt(id), Student.getStudentById(studentId), Course.getCourseById(courseId));
            }
            connection.close();

        } catch (Exception e) {
            System.out.println("Не удалось подключиться к базе данных");
            System.out.println(e.getMessage());
        }
    }

    public static void insert(String name, String surname) {
        String query = "insert into students(name, surname) values(?, ?)";
        try {
            Connection connection = DriverManager.getConnection(url, login, password);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, surname);
            statement.executeUpdate();

            connection.close();

        } catch (Exception e) {
            System.out.println("Не удалось подключиться к базе данных");
            System.out.println(e.getMessage());
        }
    }
}
