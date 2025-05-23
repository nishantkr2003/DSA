public class deletion {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index, int data){
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
   //Print the linked list
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "-->");
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

    



    public static void main(String[] args) {
        deletion ll = new deletion();
        ll.print();
        ll.addFirst(20);
        ll.addFirst(10); 
        ll.addLast(40);
        ll.addLast(50);
        ll.add(2,30);
        ll.print();
        System.out.println("Size of the list: "+ll.size);
        ll.removeFirst(); 
        ll.print(); 
        ll.removeLast();
        ll.print();
        System.out.println("Size of the list: "+ll.size);

    }
}
