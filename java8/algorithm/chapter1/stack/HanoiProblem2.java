package algorithm.chapter1.stack;

import java.util.Stack;

/**
 * 汉诺塔游戏(简化版解决方案)
 * 游戏规则:
 *     1. 有左,中,右三座塔,游戏开始所有的珠子都在左侧塔, 最高层为1,以下依次递增
 *     2. 每次只能移动塔顶的一个珠子,只能从左塔移到中塔,中塔移到左塔,或者中塔移到右塔,右塔移动到中塔,不能左塔与右塔不能直接移动
 *     3. 编号小的珠子可以放在编号大的珠子上,编号大的珠子不能放在编号小的珠子上
 *     4. 将所有左塔的珠子移动到右塔游戏胜利
 * Created by xinjian.ye on 2018/4/3.
 */
public class HanoiProblem2 {

    public enum Action {
        No, LToM, MToL, MToR, RToM,
    }

    public int hanoiProblem2(int num, String left, String mid, String right) {
        Stack<Integer> lS = new Stack<>();
        Stack<Integer> mS = new Stack<>();
        Stack<Integer> rS = new Stack<>();

        lS.push(Integer.MAX_VALUE);
        mS.push(Integer.MAX_VALUE);
        rS.push(Integer.MAX_VALUE);

        for(int i = num ; i > 0; i--) {
            lS.push(i);
        }
        Action[] recods = { Action.No };
        int step = 0;
        while(rS.size() != num + 1) {
            step += fStackTotStack(recods, Action.MToL, Action.LToM, lS, mS, left, mid);
            step += fStackTotStack(recods, Action.LToM, Action.MToL, mS, lS, mid, left);
            step += fStackTotStack(recods, Action.RToM, Action.MToR, mS, rS, mid, right);
            step += fStackTotStack(recods, Action.MToR, Action.RToM, rS, mS, right, mid);
        }
        return step;
    }

    public static int fStackTotStack(Action[] records,
                                     Action preNoAct, Action nowAct,
                                     Stack<Integer> fStack, Stack<Integer> tStack,
                                     String from, String to) {
        if(records[0] != preNoAct && fStack.peek() < tStack.peek()) {
            tStack.push(fStack.pop());
            System.out.println("Move " + tStack.peek() + " from " + from + " to " + to);
            records[0] = nowAct;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        HanoiProblem2 handle = new HanoiProblem2();
        int step = handle.hanoiProblem2(3, "left", "mid", "right");
        System.out.println("total step: " + step);
    }

}
