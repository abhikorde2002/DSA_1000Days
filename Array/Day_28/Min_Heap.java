package Array.Day_28;

import java.util.List;

public class Min_Heap {
    public static void main(String[] args) {
        List<Integer> processorTime = List.of(8, 10);
        List<Integer> tasks = List.of(2, 2, 3, 1, 8, 7, 4, 5);

        System.out.println(minProcessingTime(processorTime, tasks));
    }
     public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int n = processorTime.size();
        int[] nextAvailableTime = new int[n];

        int minTime = 0;

        for (int taskTime : tasks) {
            int earliestAvailableTime = Integer.MAX_VALUE;
            int selectedProcessor = -1;

            for (int i = 0; i < n; i++) {
                int availableTime = Math.max(nextAvailableTime[i], minTime);
                if (availableTime < earliestAvailableTime) {
                    earliestAvailableTime = availableTime;
                    selectedProcessor = i;
                }
            }

            minTime = Math.max(earliestAvailableTime, minTime);
            nextAvailableTime[selectedProcessor] = earliestAvailableTime + taskTime;
        }

        return minTime;
    }
}
