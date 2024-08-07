import java.util.Arrays;
import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] =5;
//        arr[2] = 44;
//        arr[4] = 566;

        String[] str = new String[4];
        for(int i =0 ;i<str.length;i++){
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
    }
}
