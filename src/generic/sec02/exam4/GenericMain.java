package generic.sec02.exam4;

public class GenericMain {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box<String> box2 = boxing("hello");
        String stringValue = box2.getT();
        System.out.println(stringValue);
    }
}
