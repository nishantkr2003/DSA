
import java.util.Scanner;
class PalindromeArray{
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker\n");
        int[] numArr = inputArray();
        boolean isPalin = isPalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is Palindrome");
        } else {
            System.out.println("Your array is not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while(i<numArr.length/2){
            if(numArr[i] !=numArr[(numArr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }


     public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}