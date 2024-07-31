package functionalinterface_and_lamdafunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class wordFrequency {
    public static void main(String[] args){
        String string="hi hello hi how are you";
        String[] array=string.split(" ");
        HashMap<String,Integer> hashMap=new HashMap<>();
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        for(String i:array){
            if(!hashMap.containsKey(i)){
                hashMap.put(i,1);
            }else {
                int frequency=hashMap.get(i);
                hashMap.put(i,frequency+1);
            }
        }
        System.out.println(hashMap);
        int maximum=0;
        int secondmaximum=0;
        String key;
        for(Map.Entry m:hashMap.entrySet()){
            if((int)(m.getValue())>=maximum){
                secondmaximum=maximum;
                maximum= (int)(m.getValue());
            }else if((int)(m.getValue())>secondmaximum ){
                secondmaximum=(int) m.getValue();
            }
        }
        System.out.println(secondmaximum);
        for(Map.Entry m:hashMap.entrySet()){
            if((int)(m.getValue())==secondmaximum) {
                System.out.println(m.getKey());
            }
        }
    }
}
