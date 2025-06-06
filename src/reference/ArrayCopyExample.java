package reference;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);

        for(int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
        System.out.println();
        System.out.println(oldStrArray[0] == newStrArray[0]);
        System.out.println(oldStrArray[1] == newStrArray[1]);
    }
}
