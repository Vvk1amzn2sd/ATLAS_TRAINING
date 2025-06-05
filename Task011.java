import java.util.Scanner;

public class Task011 {
    public static void main(String[] args) throws InterruptedException {
        String loginId = "vivek";
        int pwd = 911911;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter login ID: ");
        String ipid = sc.nextLine();

        System.out.print("Enter password: ");
        int ippw = sc.nextInt();

        if (loginId.equals(ipid) && pwd == ippw) {
            int count = 0;
            while (count < 5) {
                System.out.println("You've logged in for  the "+ count + "time.");
                Thread.sleep(2000); // 2 sec pause and then displays a total run of 5 tiems
                count++;
            }
        } else {
            System.out.println("Invalid login ID or password.");
        }

        sc.close();
    }
}