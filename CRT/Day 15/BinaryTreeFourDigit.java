import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeFourDigit {
    public static void generateBinaryNumbers(int n){
        Queue<String> queue = new LinkedList<>();
        queue.offer ("1");

        for (int i = 0; i < n; i++) {
            String number = queue.poll();

            if (number.length() < 4) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < 4 - number.length(); j++) {
                    sb.append('0');
                }
                sb.append(number);
                number = sb.toString();
            }

            System.out.println(number);

            queue.offer(number + "0");
            queue.offer(number + "1");
        }
   
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();

        System.out.println("Binary numbers:");
        generateBinaryNumbers(n);
    }
    
}
