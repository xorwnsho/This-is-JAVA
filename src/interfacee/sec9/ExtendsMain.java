package interfacee.sec9;

public class ExtendsMain {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();
        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
