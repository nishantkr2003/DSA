public class Insertion {

    // Node class to represent each element in the linked list
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


    //Insert at the beginning of the list
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Insert at the end of the list
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //Insert at a specific index in the list
        public void add(int index, int data){
            Node newNode = new Node(data);
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


        public static void main(String[] args) {
            Insertion list = new Insertion();
            list.print();
            list.addFirst(20);
            list.addFirst(10);
            list.addLast(30);
            list.addLast(40);
            list.add(2, 25);
            list.print();

        }
    
}
