package functionalinterface_and_lamdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 2, 1, 5);
        Optional<Integer> variable= list.stream()
                .max(Integer::compare);

        if(variable.isPresent())
            System.out.println(variable.get());
        else
            System.out.println(-1);
    }
}
