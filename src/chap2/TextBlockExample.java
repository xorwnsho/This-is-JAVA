package chap2;

public class TextBlockExample {
    public static void main(String[] args) {
        String str = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;
        System.out.println(str);

        String str2 = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될겁니다.
                """;
        System.out.println(str2);
    }
}
