//Wap to create an array List skip 15 numbers and print the output using foreach loop

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list); 
        List<Integer> list1 =Stream.iterate(1, n -> n + 1)
                                   .limit(30)
                                   .skip(15)
                                   .map(n->n+100)
                                 //  .map(n::intValue)
                                   .collect(Collectors.toList());

      //  System.out.println(list); 
      //  list1.map(n->n+1)
            //  .forEach(System.out::println);
        list1.forEach(n -> System.out.print(n + "\t"));
        list1.forEach(System.out::print);   //shorthand wont allow to put tab or space

        int sum = list1.stream()
                      .reduce(0, (a, b) -> a + b);
                    //  .reduce(1, (x,y) -> x*y);

        System.out.println("\n" +"sigma: " + sum);

        int mult = list1.stream()
        .reduce(1, (a, b) -> a * b);

        System.out.println("\n" +"mulitplication: " + mult);

     //   List<Integer> list1 = new ArrayList<>();
      //          list1.addAll(list);
//
                System.out.println("list: " + list);


    }
}
