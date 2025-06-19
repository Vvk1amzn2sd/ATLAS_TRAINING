// Wap to create an arrayList of your friends using string and try to sort them and display
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
      //  using list if to declare arraylist 
        List<String> Friend_list = new ArrayList<>(List.of("vivek", "priya", "Sanjay", "rajeev", "syed", "arham")); 
        Collections.addAll(Friend_list, "priyanka", "sid", "nat");   
        
        System.out.println("before sorting" + "\t" + Friend_list);
        

       

        // Filtering and sorting
        List<String> Sorted_fl = Friend_list.stream()
        .sorted()
        .collect(Collectors.toList());
                                             

        // Print the sorted list
        System.out.println("Sorted list of friends: " + Sorted_fl);
    }
    }


