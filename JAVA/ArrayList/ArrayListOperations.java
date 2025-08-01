import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add operation -- O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3,25);
        System.out.println(list);

        // Get operation -- O(1)
        int element = list.get(2); // index-2
        System.out.println("Element at index 2: " + element);

        // Delete element -- O(n)
        list.remove(2);  // index-2
        System.out.println(list);

        // Set element -- O(n)
        list.set(2,10); // (index,value)
        System.out.println(list);

        //contains -- O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //size() -- O(1)
        System.out.println("Size of the list: " + list.size());
    }
}
