package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass
    String accountNumber;
    String ownerName;
    Double balance;
    Double amount;


    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    public String getAccountNumber() {

        return this.accountNumber = accountNumber;
    }
    
    public String getOwnerName() {

        return this.ownerName = ownerName;
    }
    
    public double getBalance() {

        return this.balance = getBalance();
    }
    
    public void deposit(double amount) {
        this.amount = amount;
    }
    
    public void withdraw(double amount) {
        // Your implementation here
    }
}
