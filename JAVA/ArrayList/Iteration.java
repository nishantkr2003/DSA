import java.util.ArrayList;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add operation -- O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Size of list : " + list.size());

        for(int i=0;i<list.size();i++){
            
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
