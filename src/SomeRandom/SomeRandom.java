package SomeRandom;

import java.util.Random;

/**
 * @author hatzp
 **/
public class SomeRandom {

    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(100);

        boolean tf = random.nextBoolean();

        System.out.println(x);
        System.out.println(tf);
    }
}
