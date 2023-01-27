package abstraction04;

public class Toyota extends Car {

    String make = "Toyota";
    String model ="Camry";
    int year =2022;

    public Toyota() {
        super();    }

    @Override
    public void make() {
        System.out.println("toyota make"+make);
    }

    @Override
    public void model() {
        System.out.println("toyotanin model"+model);

    }

    @Override
    public void year() {
        System.out.println("toyotnun yıl");

    }
}
