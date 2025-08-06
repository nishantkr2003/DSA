
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.err.println(ll);

    }
    
}