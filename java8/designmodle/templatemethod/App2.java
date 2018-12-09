package designmodle.templatemethod;

/**
 * @author xinjian.ye
 * @date 2018/12/8
 */
public class App2 extends Lib2 {
    @Override
    protected void step2() {
        System.out.println("App step2");
    }

    @Override
    protected void step4() {
        System.out.println("App step4");
    }

    public static void main(String[] args) {
        Lib2 lib2 = new App2();

        lib2.run();
    }
}
