public class searching {
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

    // Iterative search for a key in the linked list
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


    // Recursive search for a key in the linked list
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
        searching ll = new searching();
        ll.print();
        ll.addFirst(20);
        ll.addFirst(10); 
        ll.addLast(40);
        ll.addLast(50);
        ll.add(2,30);
        ll.print();
        System.out.println("Searching for 30: " + ll.iterSearch(30));
        System.out.println("Searching for 100: " + ll.iterSearch(100));
        System.out.println("Searching for 30: " + ll.iterSearch(30));
        System.out.println("Searching for 100: " + ll.iterSearch(100));
    }
    
}
