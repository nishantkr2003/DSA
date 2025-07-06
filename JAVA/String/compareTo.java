// compareTo
//compareToIgnoreCase
//lexicographically 

// This program finds the largest string in an array of strings using compareTo method.
package String;
import java.util.*;
public class compareTo {
    public static void main(String[] args) {
        String[] s = {"apple", "banana", "cherry","mango"};

        String largest = s[0];
        for(int i=0;i<s.length;i++){
            if(largest.compareTo(s[i])<0){
                largest = s[i];
            }
        }
        System.out.println("The largest string is: " + largest);
    }
    
}
