class Customer {
    static int price_item = 100;

    void purchase_list() {
        Customer.price_item = 200; 
        System.out.println("Price updated to: " + Customer.price_item);
    }
}

public class Mart extends Customer {

    public static void main(String[] args) {
        Mart.price_item = 220; // Accessing static variable via subclass
        System.out.println("Static price in Mart: " + Mart.price_item);

        Mart obj = new Mart();
        obj.purchase_list();  // Calls parent class method
    }
}
