package SomeSwitch;

import java.util.Scanner;

/**
 * @author hatzp
 **/
public class SomeSwitch {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Rate the experience using 1-5 stars");

        int rating = scanner.nextInt();

        switch (rating) {
            case 1:
                System.out.println("One star");
                break;
            case 2:
                System.out.println("Two stars");
                break;
            case 3:
                System.out.println("Three stars");
                break;
            case 4:
                System.out.println("Four stars");
                break;
            case 5:
                System.out.println("Five stars");
                break;
            default:
                System.out.println("Not possible to rate such.");
        }
    }
}
