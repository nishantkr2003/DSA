import java.util.*;

public class StringFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        Set<String> result = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while(!queue.isEmpty()){
            String curr = queue.poll();
            if (curr.length() == str.length()) {
                result.add(curr);
            } 
            else{
                
            }
        }
    }
    
}
