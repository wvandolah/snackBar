package snackBarApp;;

public class Snack {
    private static int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingID;

    public Snack(String name, int quantity, double cost, int vendingID){
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }

    public  String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int addQuantity){
        this.quantity += addQuantity;
    }

    public double buySnack(int quantity){
        this.quantity -= quantity;
        return this.cost * quantity;
    }
}
