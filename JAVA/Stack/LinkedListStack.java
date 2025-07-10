
public class LinkedListStack {


    public static void main(String[] args) {
        ArrayListStack s  = new ArrayListStack();
        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
        
    }
    
}
