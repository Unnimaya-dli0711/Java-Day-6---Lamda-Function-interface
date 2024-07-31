package functionalinterface_and_lamdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateComposition {
    public static void main(String[] args){
        List<String> names= Arrays.asList("Anand","Rahul","Aamanan","Unnimaya");
        List<String> lengthGreater5=names.stream()
                .filter(name->name.length()>5)
                .collect(Collectors.toList());
        System.out.println(lengthGreater5);
        List<String> subString=lengthGreater5.stream()
                .filter(name->name.contains("ni"))
                .collect(Collectors.toList());
        System.out.println(subString);

    }
}
