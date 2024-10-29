

import java.util.Scanner;

 

public class MCQ {
    int student_roll_no,marks = 0;
    String Student_name, Testdate;
     
    public void getStudent(int student_roll_no,String Student_name,String Testdate){
        this.student_roll_no = student_roll_no;
        this.Student_name = Student_name;
        this.Testdate = Testdate;
    }
 

    // public void PerformTest(String ans1,String ans2,String ans3){
    //     //    System.out.println("Which of the following is true about Java's String class?\n a) Strings in Java are mutable.\n b) The String class is a subclass of Object.\n c) Strings in Java are stored in a mutable array.d) The String class does not provide any methods for string manipulation.");
    //     //   System.out.println("What is the default value of a boolean variable in Java?\n a) true\n b) false\n c) 0\n d) null");
    //     //   System.out.println("Which keyword is used to create a new object in Java?\n a) create\n b) new\n c) instantiate\n d) object");
         
       
    //       if(ans1 == "b"){
    //         this.marks = marks + 1;
    //       }
    //       if(ans2 == b){
    //         this.marks = marks + 1;
    //       }
    //      if(ans3 == b){
    //         this.marks = marks + 1;
    //       }
    //     }

    public void PerformTest(String ans1, String ans2, String ans3) {
        if (ans1.equals("b")) {
            this.marks = marks + 1;
        }
        if (ans2.equals("b")) {
            this.marks = marks + 1;
        }
        if (ans3.equals("b")) {
            this.marks = marks + 1;
        }
    }
    
    
    public void showresult(){
        System.out.println("Name : " + this.Student_name);
        System.out.println("roll no:" + this.student_roll_no);
        System.out.println("Date:" + this.Testdate);
        System.out.println("Your marks is" + this.marks);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        MCQ e = new MCQ();
        int roll;
        String name,date;
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your roll no");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter test date");
        date = sc.nextLine();

        e.getStudent(roll,name,date);
        
        String a1,a2,a3;
        System.out.println("Which of the following is true about Java's String class?\n a) Strings in Java are mutable.\n b) The String class is a subclass of Object.\n c) Strings in Java are stored in a mutable array.d) The String class does not provide any methods for string manipulation.");
        a1 = sc.nextLine();
        System.out.println("What is the default value of a boolean variable in Java?\n a) true\n b) false\n c) 0\n d) null");
        a2 = sc.nextLine();
        System.out.println("Which keyword is used to create a new object in Java?\n a) create\n b) new\n c) instantiate\n d) object");
        a3 = sc.nextLine();
        
        e.PerformTest(a1,a2,a3);
       e.showresult();
        


    }
}

