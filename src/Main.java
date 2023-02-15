import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eanter your name, password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount vaggy = new SBIAccount(name, balance, password);
        System.out.println("your bank account has been generated with account number "+vaggy.getAccNo());
       //balance
        System.out.println("your account balance is "+vaggy.getBalance());
        //deposit
        System.out.println(vaggy.depositeMoney(500));
        System.out.println("new balance is "+vaggy.getBalance());
        //withdraw
        System.out.println("Enter your amount");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();
        System.out.println("Amount withdrawn "+vaggy.withdraw(amount,enteredPassword));

        //rate of interest
        System.out.println("Interest on current balance "+vaggy.getBalance()+" is "+vaggy.calculateInterest(4));
    }
}