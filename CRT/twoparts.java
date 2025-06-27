//take enen no digits  numbers and make two sub string of that first half and second half add them and square it .then match from original number.

public class twoparts {
    public static void main(String[] args) {
        String s = "2025";
        int n = s.length();
        if (n % 2 != 0) {
            System.out.println("Number must have even digits");
            return;
        }
        
        String firstHalf = s.substring(0, n / 2);
        String secondHalf = s.substring(n / 2);
        
        int firstNum = Integer.parseInt(firstHalf);
        int secondNum = Integer.parseInt(secondHalf);
        
        int sum = firstNum + secondNum;
        int square = sum * sum;
        
        if (square == Integer.parseInt(s)) {
            System.out.println("The number " + s + " is equals the original number.");
        } else {
            System.out.println("The number " + s + " does not satisfy the condition.");
        }
    }
}