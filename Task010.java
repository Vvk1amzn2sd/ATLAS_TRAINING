import java.util.Scanner;
public class Task010 {
    

public static void main(String[] args) {
   // int day = 0; 
   String dayName;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter day number to get week?");
   int day = sc.nextInt();

    switch (day) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid day";
            break;
    }

    System.out.println("Day: " + dayName);
    sc.close();
}
}