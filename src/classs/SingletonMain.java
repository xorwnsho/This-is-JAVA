package classs;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 singleton 객체");
        } else {
            System.out.println("다른 singleton 객체");
        }
    }
}
