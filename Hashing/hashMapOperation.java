package Hashing;

import java.util.*;


public class hashMapOperation {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String,Integer> map = new HashMap<>();

        //Insert--O(1)
        map.put("India",1);
        map.put("USA",2);
        map.put("UK",3);
        map.put("China",4);
        map.put("Japan",5);

        System.out.println("HashMap: " + map);

        //Get -- O(1)

        int val = map.get("India");
        System.out.println("Value for key 'India': " + val);

        //ContainsKey -- O(1)

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("RSA"));

        //Remove -- O(1)

        System.out.println(map.remove("China"));
        System.out.println(map);

        //Size -- O(1)
        System.out.println("Size of HashMap: " + map.size());

        //Is empty -- O(1)
        map.clear();
        System.out.println("Is HashMap empty? " + map.isEmpty());
    }
}
