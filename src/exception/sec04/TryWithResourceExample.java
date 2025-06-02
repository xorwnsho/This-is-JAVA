package exception.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try(MyResource res = new MyResource("A")){
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
        System.out.println();
        try(MyResource res = new MyResource("B")){
            String data = res.read2();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
        System.out.println();

        MyResource res1 = new MyResource("C");
        MyResource res2 = new MyResource("C");
        try(res1; res2){
            String data1 = res1.read1();
            String data2 = res2.read2();
        } catch(Exception e){
            System.out.println("예외처리: " + e.getMessage());
        }
    }
}
