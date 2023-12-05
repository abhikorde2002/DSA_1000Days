package LeetCode_Contest.Array;

public class FIND_CHAMP_II {
    public static void main(String[] args) {
        int arr[][]={{0,1},{1,2}};
        System.out.println(findChampion(3, arr));
    }

    public static  int findChampion(int n, int[][] edges) {
        int[] inDegrees = new int[n];

       for (int[] edge : edges) {
           inDegrees[edge[1]]++;
       }

       int champion = -1;

       for (int i = 0; i < n; i++) {
           if (inDegrees[i] == 0) {
               if (champion != -1) {
                   // If there are multiple teams with no stronger teams, there is no unique champion
                   return -1;
               }
               champion = i;
           }
       }

       // If all teams are visited, return the champion; otherwise, there is no unique champion
       return champion != -1 ? champion : -1;
   }
}
