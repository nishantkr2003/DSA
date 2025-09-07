import java.util.*;

public class StackQueueUsingDequeue {

    // Stack Implementation
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

    // Queue Implementation
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int data) {
            deque.addLast(data);
        }

        public int dequeue() {
            if (deque.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            return deque.removeFirst();
        }

        public int front() {
            if (deque.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            return deque.peekFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Stack testing
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Stack peek = " + s.peek()); // 3
        System.out.println("Stack pop = " + s.pop()); // 3
        System.out.println("Stack pop = " + s.pop()); // 2
        System.out.println("Stack pop = " + s.pop()); // 1

        // Queue testing
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue front = " + q.front()); // 10
        System.out.println("Queue dequeue = " + q.dequeue()); // 10
        System.out.println("Queue dequeue = " + q.dequeue()); // 20
        System.out.println("Queue dequeue = " + q.dequeue()); // 30
    }
}
