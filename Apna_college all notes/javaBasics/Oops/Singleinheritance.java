package Oops;

class A {
    public static void methodA() {
        System.out.println("The is base class");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("This is child ");
    }
}

public class Singleinheritance {
    public static void main(String[] args) {
        B obj = new B();
        A.methodA();
        obj.methodB();

    }

}
