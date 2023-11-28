import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] abc = {0,0,0,0,0};
        System.out.println(abc);
        char[] arr = new char[10];
        System.out.println(abc[0]);
        abc[2]=10;
        System.out.println(arr[0]);

        int[] arr1 = new int[5];
        arr[2] = 10;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= in.nextInt();
            System.out.println(arr1[i]);
        }
        System.out.println(Arrays.toString(arr1));

        for(int num:arr){
            System.out.println(num);
        }

    }
}
