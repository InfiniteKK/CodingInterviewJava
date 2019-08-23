public class Application {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        System.out.println(myStack.pop());
        myStack.push('d');
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
