import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
      //  using list if to declare arraylist 
        List<Integer> numbers = new ArrayList<>();    
        
        // addin randm no.s
        for(int i =1; i<11; i++) {
            numbers.add(i);
            numbers.add(i);
        }

        System.out.println("before filtering" + "\t" + numbers);

        ///ufiltering
        List<Integer> sn = numbers.stream().distinct().collect(Collectors.toList());
                                             // .forEach((p) -> System.out.println(p));

        // Print the squared numbers
        System.out.println("only unique no.s after going duplicate check: " + sn);
    }
}


