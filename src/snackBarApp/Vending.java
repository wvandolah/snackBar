package snackBarApp;;

public class Vending {
    private static int maxId;
    private int id;
    private String name;

    public Vending(String name){
        maxId++;
        id = maxId;

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}