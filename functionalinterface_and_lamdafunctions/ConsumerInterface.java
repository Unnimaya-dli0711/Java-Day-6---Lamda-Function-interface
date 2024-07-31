package functionalinterface_and_lamdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args){
        List<String> list= Arrays.asList("Unnimaya","Sandra");
        Consumer<String> upperCase=name-> System.out.println(name.toUpperCase());
        for(String name:list){
            upperCase.accept(name);
        }
    }
}
