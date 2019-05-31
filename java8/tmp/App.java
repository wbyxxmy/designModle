package tmp;

class Base {

    public static void foo() {
        System.out.println("Base.foo() invoked");
    }

    public void bar(int c) {
        System.out.println("Base.bar(int) invoked");
    }

    public void bar(Character c) {
        System.out.println("Base.bar(Character) invoked");
    }

    public void baz(Object o) {
        System.out.println("Base.baz(Object) invoked");
    }

    public void baz(Integer i) {
        System.out.println("Base.baz(Integer) invoked");
    }

}

class Child extends Base {
    public static void foo() {
        System.out.println("Child.foo() invoked");
    }

    public void bar(Character c) {
        System.out.println("Child.bar(Character) invoked");
    }

    public void bar(char c) {
        System.out.println("Child.bar(char) invoked");
    }
}

public class App {

    public static void main(String[] args) {
        Base child = new Child();

        System.out.println("第1段输出：");
        child.foo();
        child.bar(new Character('C'));

        System.out.println("第2段输出：");
        Object integer = new Integer(100);
        child.baz(integer);

        System.out.println("第3段输出：");
        child.bar('C');

    }
}