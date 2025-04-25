 
public class Driver {
    


    public static void main(String[] args) {
        // your code here
        System.out.println("Driver class is running!");


        // Creates an object of Car
        Car myCar = new Car();
        // Calls the drive method of the Car class
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        myCar.drive();
       
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
