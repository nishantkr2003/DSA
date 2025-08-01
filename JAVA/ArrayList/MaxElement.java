import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(-20);
        list.add(5);
        list.add(3);
        list.add(-50);
        list.add(636);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
                System.out.println("Max element is "+max);
            }
        }
    }
}
