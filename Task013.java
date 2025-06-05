public class Task013 {
    public static void main(String[] args) {
        // display 1 to 10, skipping 5 and 7
        for (int count = 1; count < 11; count++) {
            if (count != 5 && count != 7) {
                System.out.println("The numbers: " + count + "\n");
            }
        }
    }
}
