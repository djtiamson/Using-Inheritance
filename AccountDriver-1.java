/*Dannah Janelle M. Tiamson | BSIS-2A
OOP Activity - Using Inheritance
*/

//class to test bank account, checking account, and savings account classes
public class AccountDriver {
    public static void main(String[] args) {
        
        // Creating a Checking Account for Benjamin Franklin
        CheckingAccount checkingAccount = new CheckingAccount("Benjamin Franklin", 1000.00);
        System.out.println("\nAccount Number " + checkingAccount.getAccountNumber() +
                " belonging to " + checkingAccount.getOwner());
        System.out.println("Initial balance = $" + checkingAccount.getBalance());
        checkingAccount.deposit(500.00);
        System.out.println("After deposit of $500.00, balance = $" + checkingAccount.getBalance());
        checkingAccount.withdraw(1000.00);
        System.out.println("After withdrawal of $1000.00, balance = $" + checkingAccount.getBalance());

        // Creating a Savings Account for William Shakespeare
        SavingsAccount savingsAccount = new SavingsAccount("William Shakespeare", 400.00);
        System.out.println("\nAccount Number " + savingsAccount.getAccountNumber() +
                " belonging to " + savingsAccount.getOwner());
        System.out.println("Initial balance = $" + savingsAccount.getBalance());
        savingsAccount.deposit(500.00);
        System.out.println("After deposit of $500.00, balance = $" + checkingAccount.getBalance());
        savingsAccount.withdraw(1000.00);
        System.out.println("Insufficient funds to withdraw $1000.00, balance = $" + savingsAccount.getBalance());
        savingsAccount.postInterest();
        System.out.println("After monthly interest has been posted, balance = $" + savingsAccount.getBalance());
        
        // Creating another Savings Account using the copy constructor
        SavingsAccount newSavingsAccount = new SavingsAccount(savingsAccount, 5.00);
        System.out.println("\nAccount Number " + newSavingsAccount.getAccountNumber() +
                " belonging to " + newSavingsAccount.getOwner());
        System.out.println("Initial balance = $" + newSavingsAccount.getBalance());
        newSavingsAccount.deposit(500.00);
        System.out.println("After deposit of $500.00, balance = $" + newSavingsAccount.getBalance());
        newSavingsAccount.withdraw(1000.00);
        System.out.println("Insufficient funds to withdraw $1000.00, balance = $" + newSavingsAccount.getBalance());

        // Creating a Savings Account for Isaac Newton
        SavingsAccount isaacNewtonSavings = new SavingsAccount("Isaac Newton", 1000.00);
        System.out.println("\nAccount Number " + isaacNewtonSavings.getAccountNumber() +
                " belonging to " + isaacNewtonSavings.getOwner());
    }
}