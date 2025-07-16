
//using priority queue
import java.util.PriorityQueue;
import java.util.ArrayList;
class Element{
    int number;

    Element(int number){
        this.number = number;
    }

}

public class KlargestElement {


    public static void main(String[] args) {
        int[] arr = {5,20,3,100,11,70};
        //int k = 3;
        PriorityQueue<Integer> q= new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        
        }
        System.out.println(q);

        int k=3;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(q.poll());
        }
        System.out.println("K largest elements are: " + ans);        
    }
}
