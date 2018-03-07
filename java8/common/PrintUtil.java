package common;
import java.io.PrintStream;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public class PrintUtil {
    public PrintUtil() {
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void print() {
        System.out.println();
    }

    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
