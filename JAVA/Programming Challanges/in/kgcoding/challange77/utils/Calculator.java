package in.kgcoding.challange77.utils;
import in.kgcoding.challange77.geometry.Circle;
import in.kgcoding.challange77.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4, 6);

        double circleArea = Math.PI * Math.pow(c.radius, 2);
        int rectangleArea = r.length * r.width;


        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);

    }
    
}


//javac in/kgcoding/challange77/geometry/*.java in/kgcoding/challange77/utils/*.java
//java in/kgcoding/challange77/utils/Calculator