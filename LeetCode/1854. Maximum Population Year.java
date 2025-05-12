// https://leetcode.com/problems/maximum-population-year/description/

class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101]; // Index 0 => year 1950, index 100 => year 2050

        // Step 1: Use for loop to apply birth and death changes
        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];
            population[birth - 1950]++;
            population[death - 1950]--;
        }

        // Step 2: Compute prefix sum using for loop
        int maxPopulation = 0;
        int year = 1950;
        int current = 0;

        for (int i = 0; i < 101; i++) {
            current += population[i];
            if (current > maxPopulation) {
                maxPopulation = current;
                year = 1950 + i;
            }
        }

        return year;
    }
}
