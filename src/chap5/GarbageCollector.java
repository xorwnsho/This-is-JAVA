package chap5;

public class GarbageCollector {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }
}
