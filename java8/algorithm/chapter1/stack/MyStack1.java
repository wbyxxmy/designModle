package algorithm.chapter1.stack;

import java.util.Stack;

/**
 * Created by xinjian.ye on 2018/3/30.
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    MyStack1(Stack<Integer> stackData, Stack<Integer> stackMin) {
        this.stackData = stackData;
        this.stackMin = stackMin;
    }

    public void push(int data) {
        stackData.push(data);

        if(stackMin.empty() || data <= getMinValue()) {
            stackMin.push(data);
        }
    }

    public int pop() {
        if(stackData.isEmpty()) {
            throw new RuntimeException("your stack is Empty!");
        }
        int value = stackData.pop();
        if(value == stackMin.peek()) {
            stackMin.pop();
        }
        return value;
    }

    private int getMinValue() {
        if(this.stackMin.isEmpty()) {
            throw new RuntimeException("your stack is empty!");
        } else {
            return stackMin.peek();
        }
    }
}
