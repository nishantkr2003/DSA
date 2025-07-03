import java.util.*;

public class TrainPlatforms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of trains:");
        int N = sc.nextInt();
        int[] arrivals = new int[N];
        int[] departures = new int[N];

        // Read arrival and departure times
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arrivals[i] = a;
            departures[i] = a + b;
        }

        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;

        while (i < N) {
            // If arrival is before or at departure, need new platform
            if (arrivals[i] <= departures[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                // Train departed, free a platform
                platforms--;
                j++;
            }
        }

        System.out.println("no of platform: "+maxPlatforms);
    }
}
