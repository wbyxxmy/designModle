package tmp;

import java.math.BigDecimal;

/**
 * Created by xinjian.ye on 2018/1/5.
 */
public class Test {
    public static double calculate(double start, double mounthAmt, double rate) {
        return (start + mounthAmt)*(1+rate);
    }

    public static void main(String[] args) {
        BigDecimal billAmt = new BigDecimal(100);
        BigDecimal remainAmt = new BigDecimal(123);
        BigDecimal payAmt = billAmt.abs().subtract(remainAmt.abs()).negate();
        System.out.println(payAmt);
//        double mounthAmt = 5000;
//        double rate = 0.01;
//        int year = 40;
//        int mounth = 12*year;
//        double ret = calculate(0, mounthAmt, rate);
//        for(int i = 1; i < mounth; i++) {
//            ret = calculate(ret, mounthAmt, rate);
//        }
//        System.out.println("每月投入: "+ mounthAmt + "," + year + " 年后, 投入: " + mounthAmt*mounth +",收获 :" + ret + " 收入比" +ret/(mounthAmt*mounth));
    }
}
