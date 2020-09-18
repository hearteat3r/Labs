package Lab2;
import java.lang.*;
public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball(60, 80);
        Ball b2 = new Ball(140, 100);
        Ball b3 = new Ball(110, 40);
        Ball b4 = new Ball(170, 70);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(20, 40);
        b2.move(30, 50);
        b3.move(60, 90);
        b4.move(40, 70);
    }

}
