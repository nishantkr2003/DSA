package package1.inheritance;

import package1.inheritance.TwoWheeler;
import package1.inheritance.Vehical;
import package1.inheritance.MotorCycle;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehical vehicle = new Vehical();
        System.out.println("Vehicle");
        vehicle.commute();
        


        TwoWheeler two = new TwoWheeler();
        System.out.println("TwoWheeler");
        two.commute();
        two.balance();
        System.out.println();

        MotorCycle motorCycle = new MotorCycle();
        System.out.println("MotorCycle");
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();

        
    }
}


//package1 -- javac inheritance\*.javajava package1.inheritance.InheritanceTest 
//encap  -- 