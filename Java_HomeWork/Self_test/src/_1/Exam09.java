package _1;

interface Parent {
    void method1();
}

class Child1 implements Parent{
    @Override
    public void method1() {
        System.out.println("Child1");
    }
}

class Child2 implements Parent{
    @Override
    public void method1() {
        System.out.println("Child2");
    }
}

public class Exam09 {

    static void doSomething(Parent child) {
        child.method1();
    }

    public static void main(String[] args) {
        Parent child1 = new Child1();
        Parent child2 = new Child2();
        doSomething(child1); // 다형성 호출이 아님
        doSomething(child2); // 다형성 호출이 아님
    }
}
