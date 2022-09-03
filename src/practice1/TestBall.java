package practice1;

import java.sql.SQLOutput;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 2);
        Ball b2 = new Ball("yellow");
        Ball b3 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b2.setColor("black");
        b3.setSize(5);
        int a = b2.getSize();
        String b = b3.getColor();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(a);
        System.out.println(b);

    }
}
