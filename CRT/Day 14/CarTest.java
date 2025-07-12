import java.util.*;

class CarTest{
    public static void main(String[] args) {
        int[] position = {2,4,6};
        int[] speed = {3,1,2};
        int target = 20;
        int time_taken;
        int count=0;

        Stack<Integer> s = new Stack<>();
        for(int i=position.length-1;i>=0;i--){
            time_taken = (target - position[i]) / speed[i];

            while(s.isEmpty() || s.peek() < time_taken){
                s.push(time_taken);
                count += 1;
            }
        }
        System.out.println("count : "+ count);
    }
    
}