
public class Car extends Vehicle{

    private int noOfDoors;
    
    public Car(){
        super(4);
    }

    @Override
    public void makeSound() {
       System.out.println("Vroom");
    }

    @Override
    public void getSetGo() {
       System.out.println("can de decleared in vehicle or in Car");
    }

    

}
