import java.util.Scanner;
public class Task006 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter id ");
        String a = inp.nextLine();

        System.out.print("Enter pwd ");
        int b = inp.nextInt();
        // inp.nextLine(); 

        System.out.println("Hi, your login id is: " + a + "\n" + "And your pwd is: " + b);

        inp.close();
    }
}
