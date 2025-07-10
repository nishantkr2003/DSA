import java.util.Stack;

public class RemoveMiddleFromTwoStacks {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> tempStack = new Stack<>();

    public static void main(String[] args) {
        mainStack.push(1);
        mainStack.push(2);
        mainStack.push(3);
        mainStack.push(4);
        mainStack.push(5);
        System.out.println("Original Stack: " + mainStack);

        int size = mainStack.size();
        removeMiddle(0, size);

        System.out.println("Stack after removing middle element: " + mainStack);
    }

    public static void removeMiddle(int current, int size) {
        if (mainStack.isEmpty() || current == size / 2) {
            mainStack.pop();
            return;
        }

        int top = mainStack.pop();
        tempStack.push(top);

        removeMiddle(current + 1, size);

        mainStack.push(tempStack.pop());
    }
}
