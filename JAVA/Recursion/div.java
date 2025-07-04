// wap to calculate division using subtraction and recursion in java

import java.util.Scanner;
public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b==0){
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int result = divide(a, b);
        System.out.println("The division of " + a + " and " + b + " is: " + result);
    }
    public static int divide(int a,int b){
        if(a<b){
            return 0;
        }
        return 1 + divide(a-b, b);
    }
    
}
