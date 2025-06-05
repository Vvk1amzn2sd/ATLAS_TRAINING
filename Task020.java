public class Task020 {
    public static void main(String[] args) {
        char[] names = {'V', 'I', 'V', 'E', 'K', 'S', 'A', 'M', 'A', 'N', 'T'};
        System.out.println(names);
        int n = names.length;
        System.out.println("There are thsese many letters in my name: " + n);
        for (char c: names) {
            System.out.print(c + " ");
        }   
}
}