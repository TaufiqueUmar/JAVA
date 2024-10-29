
import java.util.Scanner;

public class Banko {
    int acc_no, transtype, transamount;
    String name, address,transdate;
    float amount, balance;

    public void getCustomer(int acc_no, String name, String address, float balance) {
        this.acc_no = acc_no;
        // this.transamount = transamount;
        this.name = name;
        this.address = address;
        // this.amount = amount;
        this.balance = balance;
    }

    public void performTransaction(int transtype ,int transamount ,String transdate){
        this.transtype = transtype;
        this.transamount = transamount;
        this.transdate = transdate;
        switch(transtype){
            case 1: balance = balance + transamount ;
                    break;
            case 2 :balance = balance - transamount;
                    break;
        }

    }
    public void showCustomer(){
        // this.name = name;
        // this.acc_no = acc_no;
        // this.address = address;
        // this.transdate = transdate;
        // this.balance = balance;
        System.out.println("NAME : " + name);
        System.out.println("Account No :" + acc_no);
        System.out.println("Address :"+address);
        System.out.println("Total Balance is :"+balance);
    }
    public static void main (String args[]){
    int ano,balance1;
    String name1,address1;
    Banko e = new Banko();
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your account no");
    ano = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your name:");
    name1 = sc.nextLine();
    System.out.println("Enter your address:");
    address1 = sc.nextLine();
    System.out.println("Enter your initial balance:");
    balance1 = sc.nextInt();
    
    e.getCustomer(ano,name1,address1, balance1);
     
    int tt,amt;
    String tdate;
    System.out.println("Enter the transaction date:");
    tdate = sc.next();
    System.out.println("Enter your TRANSACTION TYPE : 1 FOR DEPOSIT 2 FOR WITHDRAW");
    tt = sc.nextInt();
    System.out.println("Enter the amount");
    amt = sc.nextInt();
    e.performTransaction(tt,amt,tdate);

//     int acc,tdate1,bal;
//     string name2,add;
//   e.showCustomer(name2,acc,add,tdate1,bal);
     e.showCustomer();

}

    }




