package lambda.chapter3;

import common.Artist;
import solution.Solution;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xinjian.ye on 2017/12/15.
 */
public class Question3_2 implements Solution {
    public float calAverageAge(List<Artist> list) {
        return list.stream().map(Artist::getAge).reduce(0,(sum, age)->sum+age).floatValue()/list.size();
    }
    @Override
    public void excuteTest() {
        List<Artist> artists = Arrays.asList(new Artist("zhangsan",10, "China"),
                new Artist("lisi",10, "Japanese"),
                new Artist("wangwu",12, "China")
        );
        String title = "求平均年龄(10,10,13): ";
        System.out.println(title + (float)Math.round(calAverageAge(artists)*100)/100);
    }
}
