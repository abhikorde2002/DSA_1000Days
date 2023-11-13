package Contest.Array;

public class Strongest_Pair {
    public static void main(String[] args) {
        int num[]={5,6,25,30};
        System.out.println(Strong(num));
        System.out.println(10^9);
       
    }

    static int Strong(int num[]){
        // int ans=Integer.MIN_VALUE;
        // int a=num.length;
        // int sum=0;

        // for(int i=0;i<a;i++){
        //     for(int j=i;j<a;j++){
        //     //    sum=num[i]^num[j];
        //     //    ans=Math.max(ans, sum);
        //     if(num[i]-num[j] <=Math.min(num[i],num[j])){
        //         sum=num[i]^num[j];
        //         ans=Math.max(ans, sum);
        //     }
        //     }
        // }
        //     return ans;
        int ans = 0;
        int n = num.length;
    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[j] - num[i] >= Math.min(num[i], num[j])) {
                    int currentXOR = num[i] ^ num[j];
                    ans = Math.max(ans, currentXOR);
                }
            }
        }
    
        return ans;
    }

    public static int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int[] min1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] min2 = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            min1 = updateMin(min1, nums1[i]);
            min2 = updateMin(min2, nums2[i]);

            totalSum += nums1[i] + nums2[i];
        }

        int diff1 = min1[1] != Integer.MAX_VALUE ? totalSum - min1[1] : 0;
        int diff2 = min2[1] != Integer.MAX_VALUE ? totalSum - min2[1] : 0;

        if (diff1 > diff2) {
            return 0;
        }

        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int targetSum = totalSum - nums1[i] - nums2[i];
            int currDiff1 = nums1[i] - min1[0];
            int currDiff2 = nums2[i] - min2[0];

            if (currDiff1 < currDiff2 && diff1 > 0) {
                totalSum = targetSum + min1[0];
                swaps++;
                } else if (currDiff2 < currDiff1 && diff2 > 0) {
                totalSum = targetSum + min2[0];
                swaps++;
            }
        }

        return swaps;
    }

    private static int[] updateMin(int[] min, int num) {
        if (num < min[0]) {
            min[1] = min[0];
            min[0] = num;
        } else if (num < min[1]) {
            min[1] = num;
        }
        return min;
    }
    }

