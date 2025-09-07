import java.util.*;

public class StackQueueUsingDequeue {

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            if (deque.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return deque.removeLast();
        }

        public int peek() {
            if (deque.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return deque.peekLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek = " + s.peek()); // 3
        System.out.println(s.pop()); // 3
        System.out.println(s.pop()); // 2
        System.out.println(s.pop()); // 1
        
        // Uncommenting the next line will throw an exception because the stack is empty
        // System.out.println(s.pop());
    }
}
