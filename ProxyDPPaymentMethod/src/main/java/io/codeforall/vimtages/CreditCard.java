package io.codeforall.vimtages;

/**
 * Credit card to make transactions from account
 */
public class CreditCard implements Payment{
    private final BankAccount bankAccount;

    /**
     *
     * @param bankAccount bank account to use
     */
    public CreditCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Makes a credit payment
     * @param amount amount to debit
     */
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through credit card...");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("We ran into some issues while processing your payment please try again.");
        }
        bankAccount.makePayment(amount);
    }
}
