import java.util.*;

public class chercterCompare {
    public static void main(String[] args) {
        Character[] arr = {'a', 'd', 'c', 'b', 'e'};
        
        // Sorting characters in ascending order
        Arrays.sort(arr, (a, b) -> a.compareTo(b));
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        
        // Sorting characters in descending order
        Arrays.sort(arr, (a, b) -> b.compareTo(a));
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
