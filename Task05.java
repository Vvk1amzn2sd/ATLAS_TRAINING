@FunctionalInterface
interface MyInterface {

    // abstract method
    String reverse(String n);
}
class ReverseImpl implements MyInterface {
    @Override
    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}
public class Task05 {

    public static void main( String[] args ) {

        // declare a reference to MyInterface
        // assign a lambda expression to the reference
 // Manual implementation of MyInterface
MyInterface ref = new ReverseImpl();
  /*      MyInterface ref = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };
        // call the method of the interface*/
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }

}

    

