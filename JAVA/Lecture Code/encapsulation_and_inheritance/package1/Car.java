package encapsulation_and_inheritance.package1;

public class Car {
    public String color;
    public String model;
    private double fuleLevel;
    long costOfPurchese;

    public Car() {
        
    }

    public Car(String color, String model, double fuleLevel, long costOfPurchese) {
        this.color = color;
        this.model = model;
        this.fuleLevel = fuleLevel;
        this.costOfPurchese = costOfPurchese;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuleLevel=" + fuleLevel +
                ", costOfPurchese=" + costOfPurchese +
                '}';
    }
}
