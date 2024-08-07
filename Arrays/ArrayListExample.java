import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(670);
//        list.add(671);
//        list.add(672);
//        list.add(673);
//        list.add(674);
//        list.add(675);
//
//        System.out.println(list.contains(654));
//
//        list.set(0,99);
//        list.remove(0);
//        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
