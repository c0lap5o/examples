package io.codeforall.vimtages;

/**
 * Represents a bank account
 */
public class BankAccount implements Payment {
    private double balance;

    /**
     *
     * @param initialBalance account initial balance
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     *Make a payment
     * @param amount payment amount
     */
    @Override
    public void makePayment(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of $" + amount + " made from bank account. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in bank account.");
        }
    }

    /**
     * Account Balance
     * @return account balance
     */
    public double getBalance() {
        return balance;
    }
}
