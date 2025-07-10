package encapsulation_and_inheritance.package2;
import encapsulation_and_inheritance.gettersetter.Car;

public class GetterTest {

    public static void main(String[] args) {
        Car car = new Car("Red", "Toyota", 50.0, 20000);
        car.setColor("Blue");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
    
}
