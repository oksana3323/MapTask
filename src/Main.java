import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Car,CarYerModel> carMap = new HashMap<>();

        Car car1 = new Car(1, "A123BC");
        CarYerModel carData1 = new CarYerModel(2021, "Toyota Camry", 25000, "White");
        carMap.put(car1, carData1);

        Car car2 = new Car(2, "B456CD");
        CarYerModel carData2 = new CarYerModel(2020, "Honda Civic", 20000, "Blue");
        carMap.put(car2, carData2);

        Car car3 = new Car(3, "C789DE");
        CarYerModel carData3 = new CarYerModel(2019, "Ford Mustang", 30000, "Red");
        carMap.put(car3, carData3);

        for (Map.Entry<Car, CarYerModel> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
  





  /*  Car деген класс тузунуз (Id, номер авто)
    Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
    HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/