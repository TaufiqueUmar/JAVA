import java.util.Scanner;

class InvalidCredentialsException extends Exception{
    public InvalidCredentialsException(String messege){
        super(messege);
    }
}

public class User{
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "Admin1234";

    public static void authenticate(String username,String password) throws InvalidCredentialsException{
        if(!username.equals(USERNAME) || !password.equals(PASSWORD)){
            System.out.println("Invalid username or password");
        }
        else{
            System.out.println("Login Successfull");
        }
    }

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = u.nextLine();
        System.out.print("Enter password: ");
        String password = u.nextLine();
        

        try {
            authenticate(username,password);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}