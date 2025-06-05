public class Task007 {

public static void main(String[] args) {
    Customer customer = new Customer();  // creating an object named customer of Customer class - using default constructor here
    Customer customer1 = new Customer("Vivek", 7); //using params constructor
    System.out.println(customer);
    System.out.println(customer1);
    customer.accept();  
    customer1.accept();
    customer.status();  
    customer1.status();
}
}
class Customer {
    private String name;
    private int id;
        void accept(){
        System.out.println("Customer called on this number to check if order accepted or not" );
        }
        void status(){
            System.out.println("customer finished or not, please tell");
        }

    public Customer(){
        this.name="";
        this.id=0;
    }
    public Customer(String name, int id) {   //with paramss
        this.name = name;
        this.id = id;
    }
    public String getname() {
        return name;
    }   
    public int getid() {
        return id;
    }

    @Override   // this is because for param constructor i was getting default output, this ensures that i get output for parms cons
    public String toString() {
        return "Customer's name is: " + name + " id is: " + id ;    }
}