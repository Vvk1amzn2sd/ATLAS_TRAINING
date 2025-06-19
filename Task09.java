
    
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task09 {
    public static void main(String[] args) {
      //  using list if to declare arraylist 
        List<Integer> numbers = new ArrayList<>();    
        
        // addin randm no.s
        for(int i =1; i<11; i++) {
            numbers.add(i);
        }

        System.out.println("before filtering" + "\t" + numbers);

        ///ufiltering
        List<Integer> sn = numbers.stream().filter(n -> n%2!=0).collect(Collectors.toList());
                                             // .forEach((p) -> System.out.println(p));

        // Print the squared numbers
        System.out.println("only odd no.s after filering: " + sn);
    }
}


