package String;

import java.util.ArrayList;

public class operator {
    public static void main(String[] args) {
        
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+'b');
        System.out.println("a"+1);


        System.out.println("nishant" + new ArrayList<>());
        System.out.println("nishant" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

    }
}
