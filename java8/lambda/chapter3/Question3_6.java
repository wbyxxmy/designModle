package lambda.chapter3;

import solution.Solution;

/**
 * Created by xinjian.ye on 2017/12/18.
 */
public class Question3_6 implements Solution{

    @Override
    public void excuteTest() {
        String title = "小写字母个数(AbccDde): ";
        String msg = "AbccDde";
        System.out.println(title + msg.chars().filter(c -> Character.isLowerCase(c)).count());
    }
}
