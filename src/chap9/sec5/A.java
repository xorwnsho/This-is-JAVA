package chap9.sec5;

public class A {
    String str = "A-string";

    void method(){
        System.out.println("A-method");
    }
    class B{
        String str = "B-string";
        void method(){
            System.out.println("B-method");
        }

        void print(){
            System.out.println(this.str);
            this.method();

            System.out.println(A.this.str);
            A.this.method();
        }
    }
    void useB(){
        B b = new B();
        b.print();
    }
}
