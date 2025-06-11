public class Task023 {
   static class Student {   // static class is used to make the class accessible without creating an instance of the outer class        
        String name; // = "Priya";
        int age_priya; // = 26;
        String mae; // = "viv";
        int age_viv; //= 3499;


        //constructor with paraameters
    Student (String name, int age_priya, String mae, int age_viv) { ////constructor can have any many paramteres :()
            this.name = name;
                this.age_priya=age_priya;
                    this.mae = mae;
                        this. age_viv=age_viv;
        }
    

    //default constructor
    Student() { //default constructor
        this.name = "Priya";
        this.age_priya = 26;
        this.mae = "Viv";
        this.age_viv = 3499;
    }    
}            //default must be defined if im definining parametererized, otherwiswe jawa wont just crete default automatically

        
    public static void main(String[] args) {
        Student sobj1 = new Student();     //default constrctor initialized  by the term student(), dubh
        Student sobj2 = new Student (); // -=-- in these since new is used, sobj2 wil alocated hwap meomry as well as stay in stack having reference to0 Student
        Student sobj3= new Student();
        Student [] arr = new Student[5]; 
        arr[0] = new Student("Priya", 26, "Viv", 3499);
        arr[1] = new Student("Vivek", 30, "Riya", 3000);
        arr[2] = new Student("Nathalie", 28, "Germany", 4000);
    


// accessing the array Student
        for (int i = 0; i < arr.length; i++) {

        //something must be written here to avoid null pointer exeption
            System.out.println("Element @" + i + " : {" + arr[i].name  + ", " + arr[i].age_priya + ", " + arr[i].mae + ", " + arr[i].age_viv + "}");
            
        }
    }

}