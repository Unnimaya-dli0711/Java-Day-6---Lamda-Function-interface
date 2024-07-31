package functionalinterface_and_lamdafunctions;

import java.util.function.BiFunction;

public class ConcatinateStrings {
    public static void main(String[] args){
        BiFunction<String,String,String> concatenate=(string1,string2)->(string1+" "+string2);
        System.out.println("After concatenation");
        String result=concatenate.apply("Hello","World");
        System.out.println(result);
    }
}
