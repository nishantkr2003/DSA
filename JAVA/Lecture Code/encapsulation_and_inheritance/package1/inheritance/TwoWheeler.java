package package1.inheritance;

import package1.inheritance.Vehical;

public class TwoWheeler extends Vehical {

    TwoWheeler() {
        noOfTyres = 2; 
    }

    public void balance(){
        System.out.println("I can balance myself on two tyres");
    }
    
}
