package Section7;

// This main is used for both Videos 56 and 57 challenges

public class Videos56_57_Main {

    public static void main(String[] args) {

        // Video 56 -encapsulation
//        Video56_BankAccount bobsAccount = new Video56_BankAccount();
//        bobsAccount.getBalance();
//        bobsAccount.deposit(100);
//        bobsAccount.withdraw(20);
//        bobsAccount.getBalance();

        // Video 57 - Constructors
        Video57_VipCustomer billsAccount = new Video57_VipCustomer();
        System.out.println("Customer name: " + billsAccount.getName57() + " with credit limit: " +
                billsAccount.getCreditLimit() + " and email address: " + billsAccount.getEmailAddress57());
        System.out.println("*****************");

        Video57_VipCustomer timsAccount = new Video57_VipCustomer("Tim", 2000.0);
        System.out.println("Customer name: " + timsAccount.getName57() + " with credit limit: " +
                timsAccount.getCreditLimit() + " and email address: " + timsAccount.getEmailAddress57());
        System.out.println("*****************");

        Video57_VipCustomer annsAccount = new Video57_VipCustomer("Ann", 3000.0, "ann@email.com");
        System.out.println("Customer name: " + annsAccount.getName57() + " with credit limit: " +
                annsAccount.getCreditLimit() + " and email address: " + annsAccount.getEmailAddress57());
        System.out.println("*****************");
    }

}

// Video 56 challenge - Encapsulation:
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number
// Create getters and setters for each field
// 1. To allow the customer to deposit funds, this should increment the balance field
// 2. To allow the customer to withdraw funds, this should deduct from the balance field but
// not allow the withdrawal to complete if there are insufficient funds
// You will want to create various code in the Main class (the one created by intelliJ) to confirm the code is working
// Add some System.out.println's in the 2 methods above as well

// Video 57 challenge - Constructor:
// Create a new class VipCustomer
// it should have 3 fields name, credit limit and email address
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields
// create getters only for this using code generation of intelliJ as setters won't be needed
// test and confirm it works