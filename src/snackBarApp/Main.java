package snackBarApp;;

public class Main{

    private static void workWithData(){

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Vending v1 = new Vending("Food");
        Vending v2 = new Vending("Drink");
        Vending v3 = new Vending("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        c1.buy(s4.buySnack(3));
        System.out.println("*** c1 buys 3 s4");
        System.out.println("Cust Cash: " + c1.getCash());
        System.out.println("snack quanity: " + s4.getQuantity());

        c1.buy(s3.buySnack(1));
        System.out.println(c1.getName() + " buys 1 " + s3.getName());
        System.out.println(c1.getName() + " Cash: " + c1.getCash());
        System.out.println(s3.getName() + " quanity: " + s3.getQuantity());


        c2.buy(s4.buySnack(2));
        System.out.println(c2.getName() + " buys 2 " + s4.getName());
        System.out.println(c2.getName() + " Cash: " + c2.getCash());
        System.out.println(s4.getName() + " quanity: " + s4.getQuantity());

        c1.addCash(10);
        System.out.println(c1.getName() + " addes $10 cash " + c1.getCash());

        c1.buy(s2.buySnack(1));
        System.out.println(c1.getName() + " buys 1 " + s2.getName());
        System.out.println(c1.getName() + " Cash: " + c1.getCash());
        System.out.println(s2.getName() + " quanity: " + s2.getQuantity());

        s3.setQuantity(12);
        System.out.println(s3.getName() + " addes 12 " + s3.getQuantity());

        c2.buy(s3.buySnack(3));
        System.out.println(c2.getName() + " buys 3 " + s3.getName());
        System.out.println(c2.getName() + " Cash: " + c2.getCash());
        System.out.println(s3.getName() + " quanity: " + s3.getQuantity());
    }

    public static void main(String[] args){
        workWithData();
    }
}