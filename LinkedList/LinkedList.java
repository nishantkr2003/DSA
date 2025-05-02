public class LinkedList {

    // Node class to represent each element in the linked list
    // It contains data and a reference to the next node
    // The Node class is static so that it can be used without creating an instance of LinkedList


    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }



    // Head of the linked list
    public static Node head; 
    // Tail of the linked list
    public static Node tail;
    //size of the linked list
    public static int size;
    

    public void addFirst(int data){
         //Step - 1: create a new node
         Node newNode = new Node(data);
         size++;
         //Step - 2: check if the list is empty
         if(head == null){
            head = tail = newNode;
            return;
         }
         // Step - 3: head = newNode
        newNode.next = head; 
         head = newNode;
    }



    public void adsLast(int data){
        // Step -1: create new Node
        Node newNode = new Node(data);
        size++;
        // Step -2: check if the list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step -3: tail.next = newNode
        tail.next = newNode;
        tail = newNode;
    }



    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(20);
        ll.addFirst(10); 
        ll.adsLast(40);
        ll.adsLast(50);
        ll.add(2,30);
        System.out.println("Size of the list: " + size);
        ll.print(); 
    }
}
