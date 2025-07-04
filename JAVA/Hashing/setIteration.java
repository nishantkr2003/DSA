package Hashing;
import java.util.*;


public class setIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");
        cities.add("Philadelphia");

        // method -1 using iterator
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // method -2 using for-each loop
        for(String city:cities){
            System.out.println(city);
        }

    }
}
