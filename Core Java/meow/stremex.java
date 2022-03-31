package meow;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class stremex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(17);
        list.add(19);
        list.add(-4);

        /*// print even ones
        System.out.println("For Each :-");
        for (Integer i : list) {
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nLambda :-");
        list.forEach(e -> {
            if(e % 2 == 0) {
                System.out.print(e + ", ");
            }
        });*/
        // System.out.println("\nStream :-");
        list.stream().findAny();
        // list.stream().sorted().forEach(System.out::println);
        list.stream().filter(new pre()).collect(Collectors.toList()).forEach(System.out::println);;
        //list.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList()).forEach(System.out::println);
    }
}

class pre implements Predicate<Integer> {

    @Override
    public boolean test(Integer e) {
        if(e % 2 == 0) {
            return true;
        }
        return false;
    }

}
