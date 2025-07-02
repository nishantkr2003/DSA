import java.util.*;


public class minimumCoins {
    // [1,2,5,10,20,50,100,200,500,2000]
    public static void main(String[] args) {
        int amount = 2100;
        int[] coins = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        
        for(int i=0;i<coins.length;i++){
            while(amount >= coins[i]){
                amount -= coins[i];
                count++;
                System.out.println("Coin used: " + coins[i]);
            }
        }
        System.out.println("Minimum number of coins required: " + count);
    }
}
