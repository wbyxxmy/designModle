package common;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by xinjian.ye on 2017/7/24.
 */
public class MapUtil {
    //Map按key值求和
    public static void add(Map<String, BigDecimal> map, String key, BigDecimal value) {
        if(map.get(key) != null) {
            map.put(key,map.get(key).add(value));
        } else {
            map.put(key, value);
        }
    }

    /**
     * 根据List元素的某一属性去重
     * @param keyExtractor
     * @param <T>
     * @return
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
