import java.util.*;

public class sortEvenNode {
    Node headNode;

    public void buildList(int[] input) {
        if (input.length == 0) {
            headNode = null;
            return;
        }

        headNode = new Node(input[0]);
        Node tailNode = headNode;

        for (int i = 1; i < input.length; i++) {
            tailNode.next = new Node(input[i]);
            tailNode = tailNode.next;
        }
    }

    public void printList() {
        Node current = headNode;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void sortEvenOddSeparately() {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        Node current = headNode;
        while (current != null) {
            if (current.value % 2 == 0) {
                int c= Integer.MIN_VALUE;

                if(current.value > c) {
                    c = current.value;
                    even.add(c);
                }  
            } else {
                odd.add(current.value);
            }
            current = current.next;
        }

        Collections.sort(even);
        Collections.sort(odd);

        List<Integer> merged = new ArrayList<>();
        merged.addAll(even);
        merged.addAll(odd);

        headNode = new Node(merged.get(0));
        Node temp = headNode;
        for (int i = 1; i < merged.size(); i++) {
            temp.next = new Node(merged.get(i));
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] input = {6, 5, 3, 4, 1, 7, 2}; // Original list
        sortEvenNode list = new sortEvenNode();
        list.buildList(input);

        System.out.print("Original list: ");
        list.printList();  

        list.sortEvenOddSeparately();       

        System.out.print("Sorted list:   ");
        list.printList(); 
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
