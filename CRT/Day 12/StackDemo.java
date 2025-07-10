import java.util.Stack;
import java.util.Scanner;

public class StackDemo {
    static Stack<Integer> stack = new Stack<>();
    static int limit = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 7;
        System.out.println("Enter " + count + " integers:");

        for (int i = 0; i < count; i++) {
            int item = input.nextInt();
            addItem(item);  // use our custom method
        }

        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // System.out.println("Stack: " + stack);
        // System.out.println("Top element: " + stack.peek());
        // System.out.println("Popped element: " + stack.pop());
        // System.out.println("Stack after pop: " + stack);
        // System.out.println("Is stack empty? " + stack.isEmpty());
        // System.out.println("Stack size: " + stack.size());

        // stack.push(40);
        // System.out.println("Stack after pushing 40: " + stack);
    }

    // Custom addItem() method with limit check
    public static void addItem(int item) {
        if (stack.size() < limit) {
            stack.push(item);
            System.out.println("Added item: " + item);
        } else {
            System.out.println("Stack is full. Cannot add item: " + item);
        }
    }
}
