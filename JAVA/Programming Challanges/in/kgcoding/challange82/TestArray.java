//package in.kgcoding.challange82;

//import in.kgcoding.challange82.ArrayOperations.Statistics;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,4,9});

        ArrayOperations.Statistics s = opr.new Statistics();
        System.out.println(s.mean());
    }
}
