
public class Car extends Vehicle{

    private int noOfDoors;
    
    public Car(){
        super(4);
    }

    @Override
    public void makeSound() {
       System.out.println("Vroom");
    }

}
