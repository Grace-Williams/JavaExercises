package section7.lecture56;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double depositAmount){

        this.balance = this.balance + depositAmount;
        System.out.println("The current balance after your deposit of £" + depositAmount + " is £" + this.balance);
    }

    public void withdrawal(double withdrawalAmount){

        if (withdrawalAmount > this.balance){
            System.out.println("Insufficient funds.");
        }

        this.balance = this.balance - withdrawalAmount;
        System.out.println("The current balance after your withdrawal of £" + withdrawalAmount + " is £" + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

// Video 56 challenge:
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number
// Create getters and setters for each field
// 1. To allow the customer to deposit funds, this should increment the balance field
// 2. To allow the customer to withdraw funds, this should deduct from the balance field but
// not allow the withdrawal to complete if there are insufficient funds
// You will want to create various code in the Main class (the one created by intelliJ) to confirm the code is working
// Add some System.out.println's in the 2 methods above as well
