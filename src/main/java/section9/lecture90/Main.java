package section9.lecture90;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.12);
        bank.addCustomer("Adelaide", "Mike", 100.35);
        bank.addCustomer("Adelaide", "Percy", 45.90);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 340.10);

        bank.addCustomerTransaction("Adelaide", "Tim", 20.10);
        bank.addCustomerTransaction("Adelaide", "Tim", 90.00);
        bank.addCustomerTransaction("Adelaide", "Tim", 23.00);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);


    }
}

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arrayList of Branches
// Each Branch should have an arrayList of Customers
// The Customer class should have an arrayList of Doubles (transactions)
// Customer:
// Name, and the arrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions