package String;

public class Performance{
    public static void main(String[] args) {
        

        String s = "";
        String name ="nishant Kumar";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            s += ch; // String concatenation using + operator
        }
        System.out.println(s);

        System.out.println(name.toUpperCase()); // Convert to uppercase
        System.out.println(name.toLowerCase()); // Convert to lowercase
        System.out.println(name.length()); // Get length of string
        System.out.println(name.charAt(0)); // Get character at index 0
        System.out.println(name.indexOf("a"));
    }
}