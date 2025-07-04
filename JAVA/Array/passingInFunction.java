import java.util.Arrays;
public class passingInFunction {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
    
}
