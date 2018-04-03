package algorithm.chapter1.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by xinjian.ye on 2018/4/2.
 */
public class TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue() {
        stackPop =new Stack<Integer>();
        stackPush = new Stack<Integer>();
    }

    public void add(int val) {
        stackPush.push(val);
    }

    public int poll() {
        stackConvert();
        return stackPop.pop();
    }

    public int peek() {
        stackConvert();
        return stackPop.peek();
    }

    private void stackConvert() {
        if(stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Queue is Empty!");
        } else if(stackPop.isEmpty()) {
            while(!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Integer> popvals = new ArrayList<>();
        stackPop.stream().forEach(p -> popvals.add(p));
        sb = sb.append("stackpop elements: "+ popvals);
        List<Integer> pushvals = new ArrayList<>();
        stackPush.stream().forEach(p -> pushvals.add(p));
        sb = sb.append("\nstackpush elements: " + pushvals);
        return sb.toString();
    }

    public static void main(String[] args) {
        TwoStacksQueue queue = new TwoStacksQueue();
        int i = 0;
        System.out.println("Stack is Empty now!!");
        System.out.println("a: add XXX, b: poll c: peek");
        try {
            while (i != -1) {
                i = System.in.read();

                switch (i) {
                    case 'a' :
                        int val = System.in.read();
                        queue.add(val); break;
                    case 'b' : queue.poll(); break;
                    case 'c' : queue.peek(); break;
                }
            }

            System.out.println(queue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
