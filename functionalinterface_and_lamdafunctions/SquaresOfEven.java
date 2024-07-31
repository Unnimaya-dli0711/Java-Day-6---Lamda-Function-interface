package functionalinterface_and_lamdafunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresOfEven {
    public static void main(String[] args){
        List<Integer> arrayList=  Arrays.asList(1,2,3,4);
        int squares_even=arrayList.stream()
                .filter(n->n%2==0)
                .mapToInt(n->n*n)
                .sum();
        System.out.println(squares_even);
    }
}
