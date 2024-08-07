import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //syntax
        // datatype[] var_name = new datatype[size];

        Scanner in = new Scanner(System.in);
        int[] rollno = {23,12,45,34,67};


        for(int i =0;i<rollno.length;i++){
            rollno[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(rollno));

    }
}
