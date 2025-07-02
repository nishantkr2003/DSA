import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "cherry", "banana", "date", "elderberry"};

        Arrays.sort(arr,(a,b) ->a.compareTo(b));
        System.out.println(Arrays.toString(arr));
    }
}
