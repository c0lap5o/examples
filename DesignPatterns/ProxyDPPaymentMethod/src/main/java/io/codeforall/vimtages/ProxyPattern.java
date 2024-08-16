package io.codeforall.vimtages;

/**
 * Proxy Pattern Example
 */
public class ProxyPattern {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount bankAccount = new BankAccount(10000000.00);
        // Create a credit card linked to the bank account
        CreditCard creditCard = new CreditCard(bankAccount);
       //Create payment method linked to bank account
        MbWay mbWay = new MbWay(bankAccount);


        // Consumer makes payments using the credit card and mbway
        creditCard.makePayment(100.00);// Payment 1
        mbWay.makePayment(10000);
        creditCard.makePayment(250.00);  // Payment 2
        creditCard.makePayment(700.00);  // Payment 3 (should fail due to insufficient balance)
        mbWay.makePayment(14500);
    }
}