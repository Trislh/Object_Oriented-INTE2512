package Lab3;

import java.util.Date;

public class Account {
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    private final Date dateCreated = new Date();
    double withdraw;
    double deposit;

    Account() {}
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    // Set list
    public void setId(int id) {
        this.id = id;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate * 100;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Get list
    public int getId() {return id;}
    public double getBalance() {return balance;}
    public double getAnnualInterestRate() {return annualInterestRate;}
    public Date getDateCreated() {return dateCreated;}

    double getMonthlyInterestRate() {return annualInterestRate / 12;}
    double getMonthlyInterest() {return balance * getMonthlyInterestRate();}
    double doWithdraw(double withdraw) {
        this.withdraw = withdraw;
        return balance - withdraw;
    }
    double doDeposit(double deposit) {
        this.deposit = deposit;
        return balance + deposit;
    }
}
