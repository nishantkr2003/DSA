
public class Car {
    

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel");        
        }
        else if(currentFuelInLiters < 5){
            System.out.println("Car is low on fuel, please refuel soon");
              
        }
        else{
            System.out.println("Car is starting ......");
            currentFuelInLiters--;
        }
        return this;
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is driving");
        
        
        
    }

    public void addFuel(float fuel){
        System.out.println("Adding fuel to the car");
        currentFuelInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        System.out.println("Current fuel level");
        return currentFuelInLiters;
    }

}  
