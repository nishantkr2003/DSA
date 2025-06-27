public class nonPalindromicSubstring {
    public static void main(String[] args) {
        String s = "abccba";

        if (allSame(s)) {
            System.out.println("No non-palindromic substring exists.");
        } else if (!isPalindrome(s)) {
            System.out.println(s);
        } else {
            // Remove one character from end
            System.out.println(s.substring(0, s.length() - 1));
        }
    }

    static boolean allSame(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0))
                return false;
        }
        return true;
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        }
        return true;
    }
}