package snackBarApp;;

public class Customer {
    private static in maxId;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash){
        maxId++;
        in = maxId;

        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(double cashAdd){
        this.cash += cashAdd;
    }

    public void buy(double cost){
        this.cash -= cost;
    }

}