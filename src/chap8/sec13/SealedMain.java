package chap8.sec13;

public class SealedMain {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();

        InterfaceA a = impl;
        InterfaceB b = impl;
        InterfaceC c = impl;

        a.methodA();
        System.out.println();

        b.methodA();
        b.methodB();
        System.out.println();

        c.methodA();
        c.methodB();
        c.methodC();
    }
}
