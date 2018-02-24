package lambda.chapter3;

import solution.Solution;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xinjian.ye on 2017/12/18.
 */
public class Question3_7 implements Solution {
    @Override
    public void excuteTest() {
        List<String> lists = Arrays.asList("123Ad","12Ab","aa12!$b","iAFTe");
        System.out.println(lists.stream().reduce("未找到小写字母数最小的字符串!!",(a,b)-> b.chars().filter(c->Character.isLowerCase(c)).count()<a.chars().filter(c->Character.isLowerCase(c)).count()?b:a));
    }
}
