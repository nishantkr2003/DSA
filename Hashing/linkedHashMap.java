package Hashing;
import java.util.*;



public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 1);
        lhm.put("USA", 2);
        lhm.put("UK", 3);
        lhm.put("China", 4);
        lhm.put("Japan", 5);
        System.out.println("LinkedHashMap: " + lhm);


        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 1);
        hm.put("USA", 2);
        hm.put("UK", 3);
        hm.put("China", 4);
        hm.put("Japan", 5);
        System.out.println("HashMap: " + hm);
    }    
}
