public class DeleteMiddleNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    
    public Node deleteMiddleNode(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        // 1 - 2 - 3 prev-slow-fast
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }




    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteMiddleNode l = new DeleteMiddleNode();
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.addFirst(0);
        l.print();
        head = l.deleteMiddleNode(head);
       l.print();
    }    
}
