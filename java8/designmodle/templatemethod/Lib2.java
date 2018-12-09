package designmodle.templatemethod;

/**
 * @author xinjian.ye
 * @date 2018/12/8
 */
public abstract class Lib2 {
    private void step1() {
        System.out.println("Lib step1");
    }
    protected abstract void step2();
    private void step3() {
        System.out.println("Lib step3");
    }
    protected abstract void step4();
    private void step5() {
        System.out.println("Lib step5");
    }

    public void run() {
        step1();
        step2();
        step3();
        step4();
        step5();
    }
}
