import java.util.Scanner;

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class to handle account operations
class BankAccount {
    private double balance;
    private static final double MINIMUM_BALANCE = 500.0; // Minimum balance required

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money with exception handling for minimum balance
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount < MINIMUM_BALANCE) {
            throw new InsufficientBalanceException("Withdrawal denied! Balance cannot go below minimum of " + MINIMUM_BALANCE);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }

    // Method to show the current balance
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to demonstrate banking operations
public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // Initial balance

        account.showBalance(); // Display initial balance

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount); // Attempt to withdraw the specified amount
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); // Display exception message if withdrawal fails
        } finally {
            account.showBalance(); // Show the final balance after the attempt
            scanner.close(); // Close the scanner resource
        }
    }
}
