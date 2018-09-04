package section9.lecture90;

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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){  // if customer is not on the list means we can add that customer & the initial amount, hence, return true
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;  // false because if customer exists, we cannot add that customer and initial amount
    }

    public boolean addBranchCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i=0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;  // means customer is not on the ist so we return null

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