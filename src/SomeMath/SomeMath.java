package SomeMath;

import java.util.Scanner;

/**
 * @author hatzp
 **/
public class SomeMath {

    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//
//        double z1 = Math.max(x,y);
//        double z2 = Math.abs(y);
//
//        System.out.println(z1);
//        System.out.println(z2);

        //triangle hypotenuse calc
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("hypotenuse is " + z);



    }
}
