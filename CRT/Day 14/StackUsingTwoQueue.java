import java.util.*;
class MakeStack{

    Queue<Integer> inputQueue;
    Queue<Integer> outputQueue;

    //Constructor
    public MakeStack() {
        inputQueue = new ArrayDeque<>();
        outputQueue = new ArrayDeque<>();
    }

    //Method to add item
    public void addItem(int x) {
        outputQueue.add(x);
        while (!inputQueue.isEmpty()) {
            outputQueue.add(inputQueue.poll());
        }
        Queue<Integer> temp = inputQueue;
        inputQueue = outputQueue;
        outputQueue = temp;
    }

    //Method to remove item
    public int removeItem() {
        if (inputQueue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return inputQueue.poll();
    }

    //method to print
    public void printStack() {
        System.out.println("Stack : " + inputQueue);
    }


    public static void main(String[] args) {
        MakeStack stack = new MakeStack();

        stack.addItem(10);
        stack.addItem(20);
        stack.addItem(30);
        stack.printStack(); 
        stack.removeItem();
        stack.printStack(); 
        
    }


}