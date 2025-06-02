package start;

public class Memory {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        MemoryExample me = new MemoryExample(10, 20);
        me.sum();
    }
}
class MemoryExample{
    int x;
    int y;

    public MemoryExample(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void sum(){
        System.out.println((x+y));
    }
}
