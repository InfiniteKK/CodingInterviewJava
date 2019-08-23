public class Application {

    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.appendTail('a');
        queue.appendTail('b');
        queue.appendTail('c');
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        queue.appendTail('d');
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}
