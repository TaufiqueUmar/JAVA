import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class mcqsql {
    int student_roll_no, marks = 0;
    String Student_name, Testdate;

    public void getStudent(int student_roll_no, String Student_name, String Testdate) {
        this.student_roll_no = student_roll_no;
        this.Student_name = Student_name;
        this.Testdate = Testdate;
    }

    public void PerformTest(String ans1, String ans2, String ans3) {
        if (ans1.equals("b")) {
            this.marks += 1;
        }
        if (ans2.equals("b")) {
            this.marks += 1;
        }
        if (ans3.equals("b")) {
            this.marks += 1;
        }
    }

    public void showResult() {
        System.out.println("Name : " + this.Student_name);
        System.out.println("Roll No: " + this.student_roll_no);
        System.out.println("Date: " + this.Testdate);
        System.out.println("Your marks: " + this.marks);
    }

    public void saveResultToDatabase() {
        String url = "jdbc:mysql://localhost:3306/MCQApp";
        String username = "root";
        String password = "T@ufique12";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO MCQResults (student_roll_no, student_name, test_date, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, this.student_roll_no);
            pstmt.setString(2, this.Student_name);
            pstmt.setString(3, this.Testdate);
            pstmt.setInt(4, this.marks);
            pstmt.executeUpdate();
            System.out.println("Results saved successfully to the database.");
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mcqsql e = new mcqsql();

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your roll no:");
        int roll = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter test date (YYYY-MM-DD):");
        String date = sc.nextLine();

        e.getStudent(roll, name, date);

        System.out.println("Which of the following is true about Java's String class?\n a) Strings in Java are mutable.\n b) The String class is a subclass of Object.\n c) Strings in Java are stored in a mutable array.\n d) The String class does not provide any methods for string manipulation.");
        String a1 = sc.nextLine();
        System.out.println("What is the default value of a boolean variable in Java?\n a) true\n b) false\n c) 0\n d) null");
        String a2 = sc.nextLine();
        System.out.println("Which keyword is used to create a new object in Java?\n a) create\n b) new\n c) instantiate\n d) object");
        String a3 = sc.nextLine();

        e.PerformTest(a1, a2, a3);
        e.showResult();

        // Save the results to the database
        e.saveResultToDatabase();
        sc.close();
    }
}
