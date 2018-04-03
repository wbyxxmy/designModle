package algorithm.chapter1.stack;

import java.util.Stack;

/**
 * 通过栈将栈 栈顶到栈底按从小到大排序
 * Created by xinjian.ye on 2018/4/3.
 */
public class SortStackByStack {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int  val = stack.pop();
            while(!help.isEmpty() && val > help.peek()) {
                stack.push(help.pop());
            }
            help.push(val);
        }
        while(!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
