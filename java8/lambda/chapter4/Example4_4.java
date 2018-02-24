package lambda.chapter4;

import common.*;
import solution.Solution;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by xinjian.ye on 2017/12/19.
 */
public class Example4_4 implements Solution {

    @Override
    public void excuteTest() {
        List<Artist> artists = Arrays.asList(new Artist("zhangsan",10, "China"),
                new Artist("lisi",10, "Japanese"),
                new Artist("wangwu",12, "China"),
                new Artist("zhaoliu",15, "American")
        );
        IntSummaryStatistics ageState = artists.stream().mapToInt(artist -> artist.getAge()).summaryStatistics();
        System.out.printf("Max: %d,Min: %d, Ave: %.2f, Sum: %d", ageState.getMax(),ageState.getMin(),ageState.getAverage(),ageState.getSum());
    }
}
