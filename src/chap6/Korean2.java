package chap6;

public class Korean2{
    // 인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;
    String name;

    public Korean2(String ssn, String name){
        // 생성자에서 final 필드 초기화
        this.ssn = ssn;
        this.name = name;
    }
}
