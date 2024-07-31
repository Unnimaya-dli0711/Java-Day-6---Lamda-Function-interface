package functionalinterface_and_lamdafunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesWithA {
    public static void main(String[] args){
        List<String> names=Arrays.asList("Anand","Rahul","Aaman");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

      //  System.out.println(sorted_list);
    }
}
