package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortScores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sample Input \n");
        int num = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(num);

        for (int i = 0; i < num; i++) {
            list.add(s.nextInt());
        }
        System.out.println("Sample output \n");
        Collections.sort(list);

        for (int x : list)
            System.out.println(x);
        s.close();
    }
}
