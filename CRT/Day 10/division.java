public class division {
    public static void main(String[] args) {
        int a=10;
        int b = 20;

        if(b>a){
            throw new CustomException("y is greater than x");
        }
    }    
}
class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
// This code defines a custom exception that is thrown when a certain condition is met.
