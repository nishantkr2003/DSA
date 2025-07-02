import java.util.*;
public class sort {
    public static void main(String[] args) {
        Integer[] arr={5,2,6,1,4,3};
        //Arrays.sort(arr,(a,b)->Integer.compare(a,b));
        Arrays.sort(arr,(a,b)->b-a);
        System.out.println(Arrays.toString(arr));
    }
    
}