package school.lemon.koboziev.HomWork.List;
import java.util.ArrayList;
public class LemonArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ferrari");
        cars.add("Bentley");
        cars.add(1,"Lexus");// добавляем
        System.out.println(cars.get(2));// выводим
        cars.set(2," Mercedes-Benz");//заменяем
        System.out.println("Amount of elements = " + cars.size());
        for(String car : cars){
            System.out.println(car);
        }
        cars.remove(2);
        System.out.println("The remaining elements");
        for(String car : cars){
            System.out.println(car);
        }

    }
}
