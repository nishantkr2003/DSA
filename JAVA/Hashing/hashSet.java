package Hashing;
import java.util.*;

public class hashSet {
   public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();

    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(40);
    hs.add(50);

    System.out.println("HashSet: " + hs);


    hs.remove(30); // Remove an element
    if(hs.contains(30)) {
        System.out.println("Set contains 30");
    }
    else {
        System.out.println("Set does not contain 30");
    }
     // Get the size of the set
     System.out.println(hs.size());

   }
}
