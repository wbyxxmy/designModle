package algorithm.chapter1.stack;

import java.util.LinkedList;

/**
 * Created by xinjian.ye on 2018/4/4.
 */
public class MaxWindow {
    public int[] getMaxWindow(int[] arr, int w) {
        //参数校验
        if(arr == null || w < 1 || arr.length < w) {
            return null;
        }

        int[] ret = new int[arr.length - w + 1];
        LinkedList<Integer> qMax = new LinkedList<>();
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            while(!qMax.isEmpty() && arr[qMax.peekLast()] <= arr[i]) {
                qMax.pollLast();
            }
            qMax.addLast(i);
            if(qMax.peekFirst() == i - w){
                qMax.pollFirst();
            }
            if(i>= w - 1) {
                ret[index++] = arr[qMax.peekFirst()];
            }
        }
        return ret;
    }
}
