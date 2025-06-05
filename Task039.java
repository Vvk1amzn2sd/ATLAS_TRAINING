public class Task039 {

    public static void main(String[] args) {

        Employee e = new Manager("vvk", "UK", 43);
        e.mailCheck();
        System.out.println("Pay is: " + e.computePay());

       
        Employee ee = new Employee("Vivek", "Delhi", 27) {
            public double computePay() {
                System.out.println("Inside anonymous computePay");
                return 4000.0;
            }
        };

        ee.mailCheck();
        System.out.println("Pay: " + ee.computePay());
    }

    static class Manager extends Employee {
        public Manager(String name, String address, int number) {
            super(name, address, number);
        }

        public double computePay() {
            System.out.println("Inside Manager computePay");
            return 5000.0;
        }
    }
}


abstract class Employee {

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("abstract class example");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract double computePay();

    public void mailCheck() {
        System.out.println("mailim to " + this.name + " " + this.address);
    }
}
