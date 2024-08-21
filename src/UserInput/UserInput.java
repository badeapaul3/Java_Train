package UserInput;

import java.util.Scanner;

/**
 * @author hatzp
 **/
public class UserInput {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("\nNice to meet you, "+name);

        System.out.println("\nHow old are you?");

        int age = scanner.nextInt();

        System.out.println("\nCool, so you are "+age + " years old");

        //clear the scanner of the remaining \n from the nextInt method call
        scanner.nextLine();

        System.out.println("What food you like?");
        var food = scanner.nextLine();

        System.out.println("So you really like "+ food);



    }

}
