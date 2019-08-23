public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long peak() {
        return stackArray[top];
    }

    public long pop() {
        return stackArray[top--];
    }


    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isMaxSize() {
        return (top == maxSize - 1);
    }

}
