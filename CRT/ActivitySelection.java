import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       
        int[][] activities = new int[N][2];

        // Read input as pair
        for (int i = 0; i < N; i++) {
            activities[i][0] = sc.nextInt(); // start time
            activities[i][1] = sc.nextInt(); // end time
        }

        // Sort by end time
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int lastEnd = -1;

        for (int i = 0; i < N; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }
        System.out.println("Maximum number of activities that can be performed: ");
        System.out.println(count);
    }
}
