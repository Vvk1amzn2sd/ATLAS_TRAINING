// Wap to run a loop / iterate()  and limit it to 20 values (1 to 2)
//While displaying use for each to limit till 10 numbers.

/*import java.util.stream.*;

public class Task14 {
    public static void main(String[] args) {
        // Generate numbers from 1 to 20 using Stream.iterate
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1)
        .limit(20);

numbers.forEach(System.out::println); 

        numbers.limit(10);

numbers.forEach(System.out::println);   // numbers.forEach(n -> System.out.println(n));


    }
}
*/
import java.util.*;
import java.util.stream.*;

public class Task14 {
    public static void main(String[] args) {
        // Generate numbers from 1 to 20 using Stream.iterate
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                                      .limit(20)
                                      .collect(Collectors.toList());

        System.out.println("All numbers (1 to 20):");
        numbers.forEach(System.out::println);

        System.out.println("\nFirst 10 numbers:");
        numbers.stream()
               .limit(10)
               .forEach(System.out::println);
    }
}

