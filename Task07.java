
    
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task07 {
    public static void main(String[] args) {
      //  using list if to declare arraylist 
        List<Integer> numbers = new ArrayList<>();    
        
        // addin randm no.s
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        System.out.println(numbers);

        ///usin stram to sqrr first use map, then collect
        List<Integer> sn = numbers.stream().map(n -> n * n).collect(Collectors.toList());
                                             // .forEach((p) -> System.out.println(p));

        // Print the squared numbers
        System.out.println("sqr no.s: " + sn);
        System.out.println(numbers);
    }
}
