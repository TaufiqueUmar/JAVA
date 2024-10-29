import java.util.Scanner;

interface Test {      /////////////////////////
    void performTest(String ans1, String ans2, String ans3);
    void showResult();
}

abstract class Student {     /////////////////////
    int studentRollNo;
    String studentName, testDate;
    int marks = 0;

    public void getStudent(int studentRollNo, String studentName, String testDate) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.testDate = testDate;
    }
}

// MCQ class implements Test interface and extends Student class
public class MCQ extends Student implements Test {
    @Override
    public void performTest(String ans1, String ans2, String ans3) {
        if (ans1.equals("b")) marks++;
        if (ans2.equals("b")) marks++;
        if (ans3.equals("b")) marks++;
    }

    @Override
    public void showResult() {
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("Date: " + testDate);
        System.out.println("Your marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MCQ mcqTest = new MCQ();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll no: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter test date: ");
        String date = sc.nextLine();

        mcqTest.getStudent(roll, name, date);

        System.out.println("Which of the following is true about Java's String class?");
        System.out.println("a) Strings in Java are mutable.");
        System.out.println("b) The String class is a subclass of Object.");
        System.out.println("c) Strings in Java are stored in a mutable array.");
        System.out.println("d) The String class does not provide any methods for string manipulation.");
        String a1 = sc.nextLine();

        System.out.println("What is the default value of a boolean variable in Java?");
        System.out.println("a) true");
        System.out.println("b) false");
        System.out.println("c) 0");
        System.out.println("d) null");
        String a2 = sc.nextLine();

        System.out.println("Which keyword is used to create a new object in Java?");
        System.out.println("a) create");
        System.out.println("b) new");
        System.out.println("c) instantiate");
        System.out.println("d) object");
        String a3 = sc.nextLine();

        mcqTest.performTest(a1, a2, a3);
        mcqTest.showResult();

        sc.close();
    }
}
