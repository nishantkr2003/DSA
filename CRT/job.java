/* 
 * you have given n jobs each with deadline and profit each job taken 1 unit of time only one job can be schedules at a time schedule a job to maximize total profit ensuring no desdlonesn are missed

input -- 
jobs:[a,b,c,d,e]
deadline:[2,1,2,1,3]
profit:[100,19,27,2515]


 */

import java.util.*;

public class job{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] deadline = {2,1,2,1,2};
        int[] profit = {100,19,27,25,15};

        String[] jobs = {"a", "b", "c", "d", "e"};
        int n = jobs.length;
        int[][] jobDetails = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobDetails[i][0] = profit[i]; // profit
            jobDetails[i][1] = deadline[i]; // deadline
            jobDetails[i][2] = i; // index of the job
        }



        // Sort jobs based on profit in descending order
        Arrays.sort(jobDetails, (a, b) -> Integer.compare(b[0], a[0]));
        boolean[] slot = new boolean[n]; // To keep track of free time slots
        String[] result = new String[n]; // To store the scheduled jobs
        int totalProfit = 0; // To store the total profit
        for (int i = 0; i < n; i++) {
            // Find a free slot for the job
            for (int j = Math.min(n - 1, jobDetails[i][1] - 1); j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true; // Mark this slot as occupied
                    result[j] = jobs[jobDetails[i][2]]; // Store the job in the result
                    totalProfit += jobDetails[i][0]; // Add profit
                    break; // Job is scheduled, break out of the loop
                }
            }
        }
        // Print the scheduled jobs and total profit
        System.out.println("Scheduled Jobs: ");
        for (String job : result) {
            if (job != null) {
                System.out.print(job + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
        


        

    }
}