import java.util.Scanner;
public class Task005 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = inp.nextInt();

        System.out.print("Enter second number: ");
        int b = inp.nextInt();

        System.out.println("First no. greater than second? " + (a > b ? true : false));

        inp.close();
    }
}
