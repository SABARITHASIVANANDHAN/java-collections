package section2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain extends Box {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Box> hs = new HashSet<Box>();
        System.out.println("enter the number of box");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter length");
            double length = s.nextDouble();
            System.out.println("Enter width");
            double width = s.nextDouble();
            System.out.println("Enter height");
            double height = s.nextDouble();
            Box b = new Box(length, width, height);
            b.setVolume(length, width, height);
            hs.add(b);

        }

        System.out.println("Unique in the set order");
        for (Box box : hs) {
            System.out.println(box.toString());
        }
        s.close();

    }

}
