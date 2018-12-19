package section7.lecture56;

// This main is used for both Videos 56 and 57 challenges

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setCustomerName("Clark Kent");
        account.setAccountNumber("123-456-7890");
        account.setEmail("clark@kent.com");
        account.setPhoneNumber("555-5555");
        account.setBalance(1000);

        System.out.println("Account name: " + account.getCustomerName());
        System.out.println("Email address: " + account.getEmail() + " Contact number: " + account.getPhoneNumber());
        System.out.println("Accout number: " + account.getAccountNumber());
        System.out.println("Current balance : £" + account.getBalance());
        account.deposit(3000);
        account.withdrawal(200);

        System.out.println();

        VipCustomer bobsAccount = new VipCustomer();
        System.out.println("Name: " + bobsAccount.getVipName() +  ", Credit limit: " + bobsAccount.getCreditLimit() + ", Email: " + bobsAccount.getVipEmail());

        VipCustomer annsAccount = new VipCustomer("Ann No", 1500);
        System.out.println("Name: " + annsAccount.getVipName() +  ", Credit limit: " + annsAccount.getCreditLimit() + ", Email: " + annsAccount.getVipEmail());

        VipCustomer timsAccount = new VipCustomer("Tim My", 2300, "tim@email.co.uk");
        System.out.println("Name: " + timsAccount.getVipName() +  ", Credit limit: " + timsAccount.getCreditLimit() + ", Email: " + timsAccount.getVipEmail());

    }
}

// Video 56 challenge - Encapsulation:
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number
// Create getters and setters for each field
// 1. To allow the customer to deposit funds, this should increment the balance field
// 2. To allow the customer to withdraw funds, this should deduct from the balance field but
// not allow the withdrawal to complete if there are insufficient funds
// You will want to create various code in the MapProgram class (the one created by intelliJ) to confirm the code is working
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