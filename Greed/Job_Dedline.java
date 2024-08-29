package Greed;

import java.util.Arrays;

public class Job_Dedline {
    public static void main(String[] args) {
       // Job[] arr={{1,4,20},{2,1,1}};
    }

    static int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(x,y)->y.profit-x.profit);
        int maxDeadline=0;
        for(Job j:arr) maxDeadline=Math.max(maxDeadline,j.deadline);
        int deadlines[]=new int[maxDeadline+1];
        Arrays.fill(deadlines,-1);
        int maxProfit=0,totalJobs=0;
        for(Job j:arr){
            for(int i=j.deadline;i>0;i--){
                if(deadlines[i]==-1){
                    deadlines[i]=j.profit;
                    maxProfit+=j.profit;
                    totalJobs++;
                    break;
                }
            }
        }
        return new int[]{totalJobs,maxProfit};
    }
}
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
