import java.util.Stack;
public class simpleMaxStack {
    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        push(mainStack, maxStack, 10);
        push(mainStack, maxStack, 5);
        push(mainStack, maxStack, 20);
        push(mainStack, maxStack, 15);

        System.out.println("Current Max: " + getMax(maxStack));

        pop(mainStack, maxStack);
        System.out.println("Current Max after pop: " + getMax(maxStack));

        pop(mainStack, maxStack);
        System.out.println("Current Max after pop: " + getMax(maxStack));

        System.out.println("Final Stack: " + mainStack);
    }

    public static void push(Stack<Integer> mainStack, Stack<Integer> maxStack, int value) {
        mainStack.push(value);
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        } else {
            maxStack.push(maxStack.peek());
        }
        System.out.println("Pushed: " + value);
    }

    public static void pop(Stack<Integer> mainStack, Stack<Integer> maxStack) {
        if (!mainStack.isEmpty()) {
            int removed = mainStack.pop();
            maxStack.pop();
            System.out.println("Popped: " + removed);
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public static int getMax(Stack<Integer> maxStack) {
        if (!maxStack.isEmpty()) {
            return maxStack.peek();
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    
}

