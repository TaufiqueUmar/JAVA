import java.util.*;
public class salary {
    public static void main(String[] args){
        double basic;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary:");
        basic = sc.nextInt();
        double DA = 0.8*basic;
       
        double CA = 0.2*basic;
        double HRA = 0.3*basic;
        double TA = 0.1*basic;
        double PF = 0.12*basic;
        double tax = 200;

        double totalsalary = basic + DA + HRA + TA -PF-tax;
        System.out.println("Total Salary is:" + totalsalary);
    }
}