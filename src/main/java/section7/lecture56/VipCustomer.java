package section7.lecture56;

public class VipCustomer {

    private String name57;
    private double creditLimit;
    private String emailAddress57;

    // constructor empty should call the constructor with 3 parameters with default values
    public VipCustomer(){
        this("Default",0.0, "default@email.com");
    }

    // constructor should pass on the 2 values it receives and add a default value for the 3rd
    public VipCustomer(String name57, double creditLimit) {
        this(name57, creditLimit, "defaul@email.com");
        this.creditLimit = creditLimit;
        this.emailAddress57 = emailAddress57;
    }

    // constructor should save all fields
    public VipCustomer(String name57, double creditLimit, String emailAddress57) {
        this.name57 = name57;
        this.creditLimit = creditLimit;
        this.emailAddress57 = emailAddress57;
    }

    public String getName57() {
        return name57;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress57() {
        return emailAddress57;
    }
}

// Create a new class VipCustomer
// it should have 3 fields name, credit limit and email address
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields
// create getters only for this using code generation of intelliJ as setters won't be needed
// test and confirm it works