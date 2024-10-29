import java.util.Scanner;

class Bank {
    String name;
    int acc_no;
    float balance;

    Bank(String name, int acc_no, float balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends Bank {
    public SavingAccount(String name, int acc_no, float balance) {
        super(name, acc_no, balance);
    }

    public void applyInterest(float rate) {
        balance += balance * rate / 100; // Corrected interest calculation
    }
}

 class BankInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        float balance = sc.nextFloat();

        SavingAccount account = new SavingAccount(name, accNo, balance);
        
        account.deposit(500);
        System.out.println("After deposit:");
        account.showBalance();
        
        account.withdraw(200);
        System.out.println("After withdrawal:");
        account.showBalance();
        
        account.applyInterest(5); // Apply 5% interest
        System.out.println("After applying interest:");
        account.showBalance();

        sc.close();
    }
}
