/*Dannah Janelle M. Tiamson | BSIS-2A
OOP Activity - Using Inheritance
*/

public class CheckingAccount extends BankAccount { //represents checking account in bank
    private static final double FEE = 0.15; //constant fee for check clearing
    

    //constructor to initialize checking account
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    //override withdraw method to include the fee for checkig clearing
    @Override
    public boolean withdraw(double amount) {
        amount += FEE;
        return super.withdraw(amount);
    }
}