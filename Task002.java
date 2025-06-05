import java.util.Scanner;
public class Task002{
    public static void main(String[] args) {
    Scanner inputt = new Scanner(System.in);    
        System.out.println("Enter first numger: ");
        int num1=inputt.nextInt();
        System.out.println("Enter second number: ");
        int num2=inputt.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    inputt.close();
}
}