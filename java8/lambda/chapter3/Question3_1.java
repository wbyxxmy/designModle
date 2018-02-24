package lambda.chapter3;

import common.*;
import solution.Solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question3_1 implements Solution {
	//3.1a 列表求和
	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0,(sum, num) -> sum+num);
	}
	//3.1b
	//返回艺术家的姓名_国籍
	public static List<String> mapArtist(List<Artist> param) {
		return param.stream().map(p -> p.getName() + "_" + p.getNational()).collect(Collectors.toList());
	}
	//3.1c 查找10岁的艺术家
	public static List<Artist> filterArtist(List<Artist> param) {
		return param.stream().filter(p -> p.getAge() == 10).collect(Collectors.toList());
	}

	@Override
	public void excuteTest() {
		String title;
		title = "1,2,4求和: ";
		System.out.println(title + addUp(Stream.of(1,2,4)));
		List<Artist> artists = Arrays.asList(new Artist("zhangsan",10, "China"),
				new Artist("lisi",10, "Japanese"),
				new Artist("wangwu",12, "China")
		);
		title = "姓名_国籍: ";
		System.out.println(title + mapArtist(artists));
		title = "10岁: ";
		System.out.println(title + filterArtist(artists));
	}
}