package lambda.chapter3;

import solution.Solution;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xinjian.ye on 2017/12/18.
 */
public class QAdvanced3_1 implements Solution {
    public <T> List<T> myMap(List<T> param) {
        return param;
    }
    @Override
    public void excuteTest() {
        List<String> list = Arrays.asList("a","ab","abc");
    }
}
