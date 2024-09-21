package DSA_Lab_05_Ahtisham;

class ArrayStack {
    private final int[] arr;
    private int top;
    private final int size;

    public ArrayStack(int size) {
        this.size = size;
        arr = new int[this.size];
        top = -1;

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full can't be pushed!");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " is pushed into the stack!");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is empty can't be popped! ");
            return -1;
        }
        int x = arr[top];
        arr[top--] = 0;
        System.out.print("Popped from the stack! Popped value is: ");
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty can't be peeked!");
            return -1;
        }
        return arr[top];
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    public int getSize() {
        System.out.print("Stack size: ");
        return size;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty can't be displayed!");
            return;
        }
        System.out.println("\nDisplaying Stack\n");
        for (int i = top; i >= 0; i--) {
            System.out.println("Stack " + (i + 1) + " element is " + arr[i]);
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.isFull());
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();


    }
}
