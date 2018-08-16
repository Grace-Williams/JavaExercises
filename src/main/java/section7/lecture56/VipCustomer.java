package section7.lecture56;

public class VipCustomer {

    private String vipName;
    private double creditLimit;
    private String vipEmail;

    public VipCustomer(){
        this("Default", 0.0,"default@email.com");
    }

    public VipCustomer(String vipName, double creditLimit) {
        this(vipName, creditLimit, "default@email.com");
        this.vipName = vipName;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String vipName, double creditLimit, String vipEmail) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getVipEmail() {
        return vipEmail;
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