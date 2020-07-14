package Lab3;

import java.util.Date;

public class Account {
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    private final Date dateCreated = new Date();

    Account() {}
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }


}
