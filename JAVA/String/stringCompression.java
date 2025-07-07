package String;

public class stringCompression {

    public static String compress(String str){
        String s = "";
        for(int i=0;i<str.length();i++){
            Integer c = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                c++;
                i++;
            }
            s += str.charAt(i);
            if(c>1){
                s += c.toString();
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "aabcccccaaa";

        String compressedStr = compress(str);
        System.out.println("Compressed String: " + compressedStr);
    }
}
