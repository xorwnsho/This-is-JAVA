package reference;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for(int i = 0; i < arr1.length; i++){
            System.out.print("arr1[" + i + "] = " + arr1[i] + " ");
        }
        System.out.println();

        arr1[0] =  1;
        arr1[1] = 2;
        arr1[2] = 3;

        for(int i = 0; i < arr1.length; i++){
            System.out.print("arr1[" + i + "] = " + arr1[i] + " ");
        }
        System.out.println();
        String[] arr2 = new String[3];
        for(int i = 0; i < arr2.length; i++){
            System.out.print("arr2[" + i + "] = " + arr2[i] + " ");
        }
        System.out.println();

        arr2[0] = "1월";
        arr2[1] = "2월";
        arr2[2] = "3월";
        for(int i = 0; i < arr2.length; i++){
            System.out.print("arr2[" + i + "] = " + arr2[i] + " ");
        }
    }
}
