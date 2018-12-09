package designmodle.templatemethod;

/**
 * @author xinjian.ye
 * @date 2018/12/8
 */
public class App1 {
    public void step2() {
        System.out.println("App step2");
    }
    public void step4() {
        System.out.println("App step4");
    }

    public static void main(String[] args) {
        Lib1 lib1 = new Lib1();
        App1 app1 = new App1();

        lib1.step1();
        app1.step2();
        lib1.step3();
        app1.step4();
        lib1.step5();
    }
}
