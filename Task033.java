class Grandparent {
    String familyName;

    Grandparent(String familyName) {
        this.familyName = familyName; //constructor
    }

    void display() {
        System.out.println("Family Name: " + familyName);
    }
}

class Parent extends Grandparent {
    String parentName;

    Parent(String familyName, String parentName) {
        super(familyName); // Call the Grandparent constructor
        this.parentName = parentName;   //parent constrcutor
    }

    @Override
    void display() {
        super.display(); // Call the Grandparent display method
        System.out.println("Parent Name: " + parentName);
    }
}

class Child extends Parent {
    String childName;

    Child(String familyName, String parentName, String childName) {
        super(familyName, parentName); // Call the Parent constructor
        this.childName = childName;   // only child construcote
    }

    @Override
    void display() {
        super.display(); // Call the Parent display method
        System.out.println("Child Name: " + childName);
    }
}

// Example usage
public class Task033 {
    public static void main(String[] args) {
        Child child = new Child("Smith", "John", "Emma");
        child.display();
    }
}