package String;

public class Palindrom {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str)); // true


    }

    static boolean isPalindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase();

        for(int i=0;i<str.length()/2;i++){
            char left = str.charAt(i);
            char right = str.charAt(str.length()-1-i);
            
            if(left != right){
                return false;
            }
        }


        return true;
    }
}
