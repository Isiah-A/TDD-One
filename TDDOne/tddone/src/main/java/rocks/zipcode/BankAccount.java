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
    Double balance = 0.0;



    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    public String getAccountNumber() {

        return accountNumber;
    }
    
    public String getOwnerName() {

        return ownerName;
    }
    
    public double getBalance() {

        return balance;

    }
    
    public void deposit(double amount) {
       balance = balance + amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= -1){
            throw new RuntimeException("Deposit amount must be positive");
        }
        balance = balance - amount;
    }
}
