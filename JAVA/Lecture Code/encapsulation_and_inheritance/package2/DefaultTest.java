package encapsulation_and_inheritance.package2;

import encapsulation_and_inheritance.package1.Car;

public class DefaultTest {
    public static void main(String[] args) {
        Car car = new Car("yellow", "BMW", 70.0, 30000L);
        //car.costOfPurchese

        System.out.println(car);
    }
    
}
