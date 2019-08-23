import java.util.Stack;

public class MyQueue {
    Stack<Character> stack1 = new Stack<Character>();
    Stack<Character> stack2 = new Stack<Character>();

    public void appendTail(char c) {
        stack1.push(c);
    }

    public char deleteHead() {
        if (stack2.size() == 0){
            if(stack1.size() == 0){
                System.out.println("MyQueue is empty.");
            }else {
                while (stack1.size() > 0){
                    stack2.push(stack1.pop());
                }
            }
        }

        return stack2.pop();

    }
}
