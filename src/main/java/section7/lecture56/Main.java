package section7.lecture56;

// This main is used for both Videos 56 and 57 challenges

public class Main {

    public static void main(String[] args) {

        // Video 56 -encapsulation
//        BankAccount bobsAccount = new BankAccount();
//        bobsAccount.getBalance();
//        bobsAccount.deposit(100);
//        bobsAccount.withdraw(20);
//        bobsAccount.getBalance();

        // Video 57 - Constructors
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("Customer name: " + vipCustomer1.getName57() + " with credit limit: " +
                vipCustomer1.getCreditLimit() + " and email address: " + vipCustomer1.getEmailAddress57());
        System.out.println("*****************");

        VipCustomer vipCustomer2 = new VipCustomer("Tim", 2000.0);
        System.out.println("Customer name: " + vipCustomer2.getName57() + " with credit limit: " +
                vipCustomer2.getCreditLimit() + " and email address: " + vipCustomer2.getEmailAddress57());
        System.out.println("*****************");

        VipCustomer vipCustomer3 = new VipCustomer("Ann", 3000.0, "ann@email.com");
        System.out.println("Customer name: " + vipCustomer3.getName57() + " with credit limit: " +
                vipCustomer3.getCreditLimit() + " and email address: " + vipCustomer3.getEmailAddress57());
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