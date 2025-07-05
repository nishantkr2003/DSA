package String;
import java.util.*;


public class shortestPAth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        float result = getShortestPath(s);
        System.out.println("The length of the shortest path is: " + result);
        
    }


    public static float getShortestPath(String s){
        int x=0;
        int y =0;

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='N'){
                y++;
            }
            else if(c=='S'){
                y--;
            }
            else if(c=='E'){
                x++;
            }
            else if(c=='W'){
                x--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
}
