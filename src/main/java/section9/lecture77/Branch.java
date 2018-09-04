package section9.lecture77;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

 //   private boolean newCustomer(String customerName, double initialAmount){
//        if(findCustomer(customerName) == null){
//            this.customers.add(new Customer((customerName, initialAmount)));
//            return true;
//        }
//    }
//
//
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