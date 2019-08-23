public class MyQueue {
    private int rear;
    private int maxSize;
    private char[] queueArray;

    public MyQueue(int maxSize) {
        this.rear = -1;
        this.maxSize = maxSize;
        this.queueArray = new char[maxSize];
    }

    public void offer(char c){
        if (rear == maxSize - 1){
            System.out.println("Queue is full.");
        }else {
            queueArray[++rear] = c;
        }
    }

    public char poll(){
        char data = queueArray[0];
        if (rear == -1){
            System.out.println("Queue is empty.");
        }else {
            for (int i = 0; i < rear; i++) {
                queueArray[i] = queueArray[i + 1];
            }
            rear--;
        }
        return data;
    }

    public char element(){
        if (rear == -1){
            System.out.println("Queue is empty.");
        }
        return queueArray[0];

    }
}
