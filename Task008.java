import java.util.Scanner;
public class Task008 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = inp.nextInt();

        System.out.print("Enter second number: ");
        int b = inp.nextInt();
        inp.close();

        System.out.println("First no. greater than second? ");
        if(a > b)
        System.out.println(" Yes");
        else 
        System.out.println(" false ");
        
    }
}
