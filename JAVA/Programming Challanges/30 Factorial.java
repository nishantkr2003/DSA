
import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial is: " + fact);
    }
    public static long factorial(int num){
        long fact=1;
        if(num<2){
            return 1;
        }
        int i=2;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}