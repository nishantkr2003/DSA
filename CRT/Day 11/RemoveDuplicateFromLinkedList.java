import java.util.HashSet;

public class RemoveDuplicateFromLinkedList {
    Node headNode;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void buildList(int[] input) {
        if (input.length == 0) {
            headNode = null;
            return;
        }

        headNode = new Node(input[0]);
        Node tail = headNode;

        for (int i = 1; i < input.length; i++) {
            tail.next = new Node(input[i]);
            tail = tail.next;
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

    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = headNode;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.value)) {
                prev.next = current.next;
            } else {
                seen.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 2, 3, 4, 2, 1, 5};  

        RemoveDuplicateFromLinkedList list = new RemoveDuplicateFromLinkedList();
        list.buildList(input);

        System.out.print("Original list: ");
        list.printList();

        list.removeDuplicates();  

        System.out.print("List after removing duplicates: ");
        list.printList();
    }
}
