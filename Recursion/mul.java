// wap to calculate multiplication using addition and recursion in java

import java.util.Scanner;

public class mul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to multiply: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiply(a, b);
        System.out.println("The multiplication of " + a + " and " + b + " is: " + result);
    }
    public static int multiply(int a,int b){
        if(b==0){
            return 0;
        }
        if(b==1){
            return a;
        }   
        return a + multiply(a, b - 1);
          
    }

}
