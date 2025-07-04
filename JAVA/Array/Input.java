import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;        
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);

        // Input using for loop
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // for each loop
        for(int i:arr){
            System.out.println(i + " ");
        }



        //Another way to print

        System.out.println(Arrays .toString(arr));

    }
}
