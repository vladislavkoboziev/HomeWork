package school.lemon.koboziev.HomWork.List;
import java.util.LinkedList;

class Cars{
    private String Brands;
    public Cars(String value){
        Brands=value;
    }
    String getBrands(){return Brands;}
}
public class LemonLinkedList {
    public static void main(String[] args) {
        LinkedList<Cars> cars = new LinkedList<Cars>();
        cars.add(new Cars("BMW"));
        cars.addFirst(new Cars("Lexus"));
        cars.addLast(new Cars("Ferrari"));

        System.out.println("Amount of elements ="+cars.size());
        for (Cars c : cars){
            System.out.println(c.getBrands());
        }
        cars.remove(2);
        System.out.println( " ");
        for (Cars c : cars){
            System.out.println(c.getBrands());
        }
        Cars first = cars.getFirst();// Вывод первого элемента
        System.out.println(" First brand =  "+first.getBrands());
    }
}
