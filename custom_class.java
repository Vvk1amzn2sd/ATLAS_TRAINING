class custom_class {
    int age = 20;   
    int number = 22;
    String name = "Priya";

    public custom_class(int age, int number, String name){
        this.age= age;
        this.number=number;
        this.name=name;
    }


}

public static void main(String[] args){
    //custom_class c = new custom_class();
    custom_class [] cc = new custom_class[50];
   // cc = { }
   cc[0] = new custom_class(25, 35, "vivek");

   



    
}