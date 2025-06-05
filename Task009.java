import java.util.Scanner;

class Task009 {
    

public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = inp.nextInt();

    System.out.println("Enter second number: ");
    int b = inp.nextInt();

    System.out.println("Enter third number: ): ");
    int c = inp.nextInt();
    inp.close();

    if (a > b && a > c) {
        System.out.println("The max no. is: " + a);
    } else if (b > a && b > c) {
        System.out.println("The max no. is: " + b);
    } else {
        System.out.println("The max no. is: " + c);
    }

    
}
}