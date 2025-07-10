package encapsulation_and_inheritance.package2;
import encapsulation_and_inheritance.package1.Car;

public class DefaultTest {
    public static void main(String[] args) {
        Car car = new Car("Yellow", "Dezire",
                5, 3000);
        //car.costOfPurchase = 8;
        
        System.out.println(car);
    }
}
