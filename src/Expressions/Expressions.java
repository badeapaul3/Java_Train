package Expressions;

/**
 * @author hatzp
 **/
public class Expressions {

    public static void main(String[] args) {

        //operand @@ operators: + - * / %
        int friends = 10;
        friends--;

        System.out.println(friends);
        double newFriends = (double)(friends-2);
        System.out.println(newFriends/3);
        System.out.println(Math.round(newFriends/5));

    }
}
