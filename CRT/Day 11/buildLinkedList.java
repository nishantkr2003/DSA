public class buildLinkedList {
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
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println();
    }

    
    public int findMiddle() {
        if (headNode == null) {
            throw new RuntimeException("List is empty");
        }

        Node first = headNode;
        Node second = headNode;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        return first.value;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        buildLinkedList list = new buildLinkedList();
        list.buildList(input);

        list.printList(); 

        int middle = list.findMiddle();
        System.out.println("Middle element: " + middle); // Output: 3
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
