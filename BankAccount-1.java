/*Dannah Janelle M. Tiamson | BSIS-2A
OOP Activity - Using Inheritance
*/

public class BankAccount { //represents a generic bank account into program
    private static int accountCounter = 10; //starter number for account generation
    
    private String owner; 
    private double balance;
    private String accountNumber;

    //constructor to initialize bank account
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
    }

    //method to set the account number
    protected void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //method to deposit money from account
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
    }

    //method to withdraw money from account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -=amount;
            return true;
        }else{
            return false;
        }
    }

    //method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //method to get owner name
    public String getOwner() {
        return owner;
    }

    //method for current balance
    public double getBalance() {
        return balance;
    }
    
    //method to generate account number
    private static String generateAccountNumber() {
       return String.format("10000%d-%d", accountCounter++, accountCounter % 2 == 0 ? 0 : 10);
    }
   
}