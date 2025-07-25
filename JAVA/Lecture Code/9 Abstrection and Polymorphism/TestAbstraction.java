
public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(2);
        Car c = new Car();
        c.commute();
        c.makeSound();
        c.getSetGo();

    }
}


//javac Transport.java  Vehicle.java Car.java TestAbstraction.java
// java TestAbstraction