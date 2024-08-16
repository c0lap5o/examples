package io.codeforall.vimtages;

public class MbWay implements Payment {
    /**
     * Credit card to make transactions from account
     */
    private final BankAccount bankAccount;

        /**
         *
         * @param bankAccount bank account to use
         */
        public MbWay(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }

        /**
         * Makes a mbway payment
         * @param amount amount to debit
         */
        @Override
        public void makePayment(double amount) {
            System.out.println("Processing payment of $" + amount + " through mbway...");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println("We ran into some issues while processing your payment please try again.");
            }
            bankAccount.makePayment(amount);
        }
}
