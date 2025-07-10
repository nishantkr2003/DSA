package encapsulation_and_inheritance.package1;

public class AccessTest {
   public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Toyota";
        //Car.fuleLevel = 50.0;
         // This line will cause an error because fuleLevel is private


        System.out.println(car);

        Car newCar = new Car("Blue", "Honda", 60.0, 20000L);
        System.out.println(newCar);
   } 
}
