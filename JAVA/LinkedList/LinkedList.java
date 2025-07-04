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





    public int removeFirst(){

        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;

        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;

        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev node : i=size-2
        Node prev = head;
        for(int i=0 ; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }



    public int iterSearch(int key){
        Node temp = head;
        int index=0;

        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;

    }


    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next,key);
        if(index == -1){
            return -1;
        }
        return index + 1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(20);
        ll.addFirst(10); 
        ll.adsLast(40);
        ll.adsLast(50);
        ll.add(2,30);
        ll.print();
        // System.out.println("Size of the list: "+ll.size);
        // ll.removeFirst(); 
        // ll.print(); 
        // ll.removeLast();
        // ll.print();
        // System.out.println("Size of the list: "+ll.size);

        System.out.println("Searching for 30: " + ll.iterSearch(30));
        System.out.println("Searching for 100: " + ll.iterSearch(100));

        System.out.println("Searching for 20: " + ll.recSearch(20));
        System.out.println("Searching for 200: " + ll.recSearch(200));
    


    }
}
