/*Dannah Janelle M. Tiamson | BSIS-2A
OOP Activity - Using Inheritance
*/

public class SavingsAccount extends BankAccount { //represents a savings account in a bank
    private double rate = 0.025; //annual interest rate
    private static int savingsNumber = 0; //savings number intialized to zero

    //constructor to initialize savings account
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        savingsNumber++;
        setAccountNumber(getAccountNumber() + "-" + savingsNumber);
    }

    //method to post montly interest to the account
    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    //override account number and savings method
    @Override
    public String getAccountNumber() {
        return super.getAccountNumber() + "-" + savingsNumber;
    }

    //copy costructor to create another savings account for the same person
    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount.getOwner(), initialBalance);
        savingsNumber++;
        setAccountNumber(getAccountNumber() + "-" + savingsNumber);
    }
}