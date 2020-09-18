package Lab1;
import java.lang.*;
public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobby", 2);
        Dog d2 = new Dog("Carter", 7);
        Dog d3 = new Dog("Jerry");
        d3.setAge(4);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
