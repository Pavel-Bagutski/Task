package ua.senla.task1;

import ua.senla.task1.Number;

public class Main {

     static byte a = 3;
     static short b = 4;
     static int c = 5;
     static long d = 5;
     static char e = 't';
     static float f = 6.6f;
     static double j = 7.7d;


    public static void main(String[] args) {
	// write your code here
        Number number = new Number();

        number.setA((byte)11);
        System.out.println(number.getA());

        number.setB((short)450);
        System.out.println(number.getB());

        number.setC(99);
        System.out.println(number.getC());

        number.setD((long)2323);
        System.out.println(number.getD());

        number.setE((char)101);
        System.out.println(number.getE());

        number.setF((float)1.789);
        System.out.println(number.getF());

        number.setJ((double)0.99999);
        System.out.println(number.getJ());

        int q = a;
        System.out.println(q);

        e = (char) f;
        System.out.println(e);


    }
}
