//public class Task037 {

    class Employee {
        protected int pwd;
        protected int salary;
        public int empid;

        Employee() {  // stting
            this.pwd = 1234;
            this.empid = 13;
            this.salary = 3000;
        }

    }


    class Hr extends Employee {
        Hr() {
            salary = 5000;
        }

        void showSalary() {
            System.out.println("Salary: " + salary); 
        }
    }
//}
public class Task037 {
    public static void main(String[] args) {
        Task037 outer = new Task037();

       // Hr hr = outer.new Hr();              
      //  Employee emp = outer.new Employee(); 
        Hr h1 = new Hr();
        System.out.println(h1.empid);
      
      System.out.println(h1.salary); // Accessing protected variable from subclass
      //}
     // Hr h1 = new Hr();
      System.out.println(h1.pwd); // Accessing protected variable from subclass
      

    //    System.out.println("Employee ID: " + emp.empid);
     //   hr.showSalary();
 //   }
}
}
    

