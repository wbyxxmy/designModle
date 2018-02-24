package lambda.chapter5;

import common.Artist;
import common.Company;
import solution.Solution;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by xinjian.ye on 2017/12/25.
 */
public class Example5_6 implements Solution {
    /**
     * 执行测试类
     */
    @Override
    public void excuteTest() {
        List<Artist> aList = Arrays.asList(new Artist("azhangsan",10, "China"),
                new Artist("alisi",10, "Japanese"),
                new Artist("awangwu",12, "China")
        );
        List<Artist> bList = Arrays.asList(new Artist("bzhangsan",10, "China"),
                new Artist("blisi",10, "Japanese"),
                new Artist("bwangwu",12, "China"),
                new Artist("bzhaoliu",15, "American")
        );
        List<Artist> cList = Arrays.asList(new Artist("czhangsan",10, "China"),
                new Artist("clisi",10, "Japanese")
        );
        Company a = new Company("a", aList);
        Company b = new Company("b", bList);
        Company c = new Company("c", cList);
        List<Company> companies = Arrays.asList(a, b, c);
        System.out.println("最大得公司(a3,b4,c2): " + getBiggestCompany(companies.stream()).get().getCompanyName());
    }

    private Optional<Company> getBiggestCompany(Stream<Company> companys) {
        Function<Company, Long> getCount = c -> c.getArtists().stream().count();
        return companys.collect(Collectors.maxBy(comparing(getCount)));
    }
}
