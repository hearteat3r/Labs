package Lab3;
import java.lang.*;
public class BookTest {
    public static void main(String[] args){
        Book d1 = new Book(" Цветы для Элджернона ", " Д.Киз", 750, 500 );
        Book d2 = new Book(" Маленький оборвыш", " Д.Гринвуд", 400, 800 );
        Book d3 = new Book(" Алхимик ", " П.Коэльо", 850, 1000 );
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();

    }
}
