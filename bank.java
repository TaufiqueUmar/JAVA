import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance:");
        int a = sc.nextInt();
        System.out.println("Enter 1 for deposit");
        System.out.println("Enter 2 withdraw");
        int b = sc.nextInt();

        switch(b){
            case 1 : if (b == 1){
                System.out.println("Enter the amount:");
                int c = sc.nextInt();
                System.out.println("Total balance is:" + (a+c));
                break;

            }
            case 2 : if (b == 2){
                System.out.println("Enter the amount:");
                int d = sc.nextInt();
                System.out.println("Total balance is:" + (a-d));
                break;

            }
            default : System.out.println("Invalid input");
        }

    }
    
}
