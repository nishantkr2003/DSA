package Hashing;

import java.util.HashMap;

public class ticket {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key), key);

        }

        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bangalore");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);
        System.out.println("Starting point: " + start);

        for(String key : tickets.keySet()){
            System.out.println(key + " -> " + tickets.get(key));
        }
    }
    
    
}
