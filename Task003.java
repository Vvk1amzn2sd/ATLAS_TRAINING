import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = inp.nextInt();

        System.out.print("Enter second number: ");
        int b = inp.nextInt();

        System.out.println("Input: " + "\n" + "a =" + a + "b = " + b);

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers swapped and output: a = " + a + ", b = " + b);

        inp.close();
 
    }
}
