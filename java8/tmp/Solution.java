package tmp;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xinjian.ye
 * @date 2018/12/19
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lastIndex = arr.length;
        Random rand = new Random();

        while(lastIndex > 0) {
            int i = rand.nextInt(lastIndex);
            int tmp = arr[i];
            arr[i] = arr[lastIndex - 1];
            arr[lastIndex-- - 1] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
