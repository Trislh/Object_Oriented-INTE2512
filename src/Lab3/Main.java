package Lab3;

public class Main {
    public static void main(String[] args) {
        Account acct1 = new Account(1122,20000);
        acct1.setAnnualInterestRate(0.045);
        acct1.doWithdraw(2500);
        acct1.doDeposit(3000);

        System.out.print("Balance: " + acct1.balance + "\n" +
                        "Monthly Interest: " + acct1.getMonthlyInterest() + "\n" +
                        "Date created: " + acct1.getDateCreated());

    }
}
