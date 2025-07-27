
public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5,6));
        System.out.println(c.add(5,6,7));
        System.out.println(c.add(5.25,6.75));
    }
}
