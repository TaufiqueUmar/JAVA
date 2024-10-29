import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        int p1,p2,p3,p4,p5;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed of biker 1:");
        p1  = sc.nextInt();
        System.out.println("Enter the speed of biker 2:");
        p2  = sc.nextInt();
        System.out.println("Enter the speed of biker 3:");
        p3  = sc.nextInt();
        System.out.println("Enter the speed of biker 4:");
        p4  = sc.nextInt();
        System.out.println("Enter the speed of biker 5:");
        p5  = sc.nextInt();

        avg = (p1+p2+p3+p4+p5) / 5.0f;                          // 5.0f
        System.out.println("Äverage speed of all bikers are: "+ avg);
        if(p1 > avg){
            System.out.println("Biker 1 is qualified.");
        }
        if(p2 > avg){
            System.out.println("Biker 2 is qualified.");
        }
        if(p3 > avg){
            System.out.println("Biker 3 is qualified.");
        }
        if(p4 > avg){
            System.out.println("Biker 4 is qualified.");
        }
        if(p5 > avg){
            System.out.println("Biker 5 is qualified.");
        }
    }
}