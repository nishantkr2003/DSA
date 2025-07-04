package Hashing;

import java.util.*;

public class hashMapIteration{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India",1);
        map.put("USA",2);
        map.put("UK",3);
        map.put("China",4);
        map.put("Japan",5);

        System.out.println("HashMap: " + map);

        // Iteration
        Set<String> keys = map.keySet();

        for (String k : keys) {
            System.out.println("Key: " + k + ", Value: " + map.get(k));
        }
    }
}