package Variables;

/**
 * @author hatzp
 **/
public class Variables {

    //Data types

    boolean bool= true;
    byte x1= 123;

    short x2 = 32767;
    int x3 = 321232122;
    long x4 = 1123123123123L;

    float x5 = 3.1234f;

    double x6 = 3.12442123123123;

    char x7 = 'f';
    //up we have primitives, which use less memory and are faster

    //string is reference data type - stores an address
    String text = "myString";

    //type inference cannot work in instance members
    //var text1 = "StringExample";


    public static void main(String[] args) {

        //type inference only in main method with initialization
        var v1= new Variables();
        System.out.println(v1.x6);


    }

}
