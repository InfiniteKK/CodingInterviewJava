import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    Queue<Character> queue1 = new ArrayDeque<Character>();
    Queue<Character> queue2 = new ArrayDeque<Character>();

    public void push(char c) {
        if(queue1.isEmpty()&& queue2.isEmpty()){
            queue1.offer(c);
            return;
        }

        if (!queue1.isEmpty()){
            queue1.offer(c);
            return;
        }else {
            queue2.offer(c);
            return;
        }


    }

    public char pop(){
        if (queue1.isEmpty() && queue2.isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        if(queue1.isEmpty()){
            while (queue2.size() > 1){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }else {
            while (queue1.size() > 1){
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
    }


}
