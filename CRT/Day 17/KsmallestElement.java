import java.util.PriorityQueue;
import java.util.ArrayList;
class Element{
    int number;

    Element(int number){
        this.number = number;
    }

}



public class KsmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 8, 5, 3, 10};
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0; i < arr.length; i++){
            q.add(arr[i]);
        }
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(q.poll());
        }
        System.out.println("K largest elements are: " + ans);    

        
        
    }
}
