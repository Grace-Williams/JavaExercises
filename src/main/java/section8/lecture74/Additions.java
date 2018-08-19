package section8.lecture74;

public class Additions {

    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private String addition5;
    private String addition6;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
    private double addition5Price;
    private double addition6Price;

    public Additions(String addition1, double addition1Price,
                     String addition2, double addition2Price,
                     String addition3, double addition3Price,
                     String addition4, double addition4Price,
                     String addition5, double addition5Price,
                     String addition6, double addition6Price) {
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.addition5 = addition5;
        this.addition6 = addition6;
        this.addition1Price = addition1Price;
        this.addition2Price = addition2Price;
        this.addition3Price = addition3Price;
        this.addition4Price = addition4Price;
        this.addition5Price = addition5Price;
        this.addition6Price = addition6Price;
    }

    public Additions(String addition1, double addition1Price,
                     String addition2, double addition2Price,
                     String addition3, double addition3Price,
                     String addition4, double addition4Price) {
        this(addition1, addition1Price,addition2, addition2Price, addition3, addition3Price,
                addition4, addition4Price, null, 0.0, null, 0.0);
    }

    public Additions(String addition1, double addition1Price,
                     String addition2, double addition2Price) {
        this(addition1, addition1Price,addition2, addition2Price, null, 0.0,
                null, 0.0, null, 0.0, null, 0.0);
    }

    public double getAdditionsTotal(){

        double additionsTotal = 0;

        if(this.addition1 != null){
            System.out.println(" Add: " + this.addition1 + " £" + this.addition1Price);
            additionsTotal += this.addition1Price;
        }
        if(this.addition2 != null){
            System.out.println(" Add: " + this.addition2 + " £" + this.addition2Price);
            additionsTotal += this.addition2Price;
        }
        if(this.addition3 != null){
            System.out.println(" Add: " + this.addition3 + " £" + this.addition3Price);
            additionsTotal += this.addition3Price;
        }
        if(this.addition4 != null){
            System.out.println(" Add: " + this.addition4 + " £" + this.addition4Price);
            additionsTotal += this.addition4Price;
        }
        if(this.addition5 != null){
            System.out.println(" Add: " + this.addition5 + " £" + this.addition5Price);
            additionsTotal += this.addition5Price;
        }
        if(this.addition6 != null){
            System.out.println(" Add: " + this.addition6 + " £" + this.addition6Price);
            additionsTotal += this.addition6Price;
        }

        System.out.println("Total additions price: £" + additionsTotal);
        return additionsTotal;
    }






}
