package day10;

class SavingsAccount {
    private static double annualInterestRate; // static variable for interest rate
    private double savingsBalance;            // instance variable

    
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    
    public void displayBalance() {
        System.out.printf("Current Balance: Rs %.2f%n", savingsBalance);
    }
}

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // set interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Annual Interest Rate: 4%");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Saver1 -> ");
        saver1.displayBalance();
        System.out.print("Saver2 -> ");
        saver2.displayBalance();

        // set interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAnnual Interest Rate: 5%");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Saver1 -> ");
        saver1.displayBalance();
        System.out.print("Saver2 -> ");
        saver2.displayBalance();
    }
}
