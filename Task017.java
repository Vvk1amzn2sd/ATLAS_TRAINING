 class Person {

    private String name;
 
    // Getter
 
    public String getName() {
 
      return name;
 
    }
 
    // Setter
 
    public void setName(String newName) {
 
      this.name = newName;
 
    }
 
 }
 public class Task017{

    public static void main(String[] args) {
  
      Person myObj = new Person();
      myObj.setName("John");
    //  myObj.name = "John"; - not able to access this way as name is private in Person class
  
    //  System.out.println(myObj.getName());
      System.out.println(myObj.name);    //this program will give error as expected
  
    }
  
  }