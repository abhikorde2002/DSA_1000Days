package Array.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Array_Subset {
    public static void main(String[] args) {
     int  a1[] = {11,1, 7, 13, 21, 3, 7, 3};
      int a2[] = {11, 1, 1, 7};
      int A[]={1 ,4, 45, 6 ,10, 8};
   System.out.println(  isSubset(a1, a2, 8, 4));
     System.out.println(find3Numbers(A, 6, 13));
    }
    static String isSubset(int a1[],int a2[],int n,int m){
//       ArrayList<Integer> arr=new ArrayList<>();
//     Arrays.sort(a1);
//      Arrays.sort(a2);
//    String isFlag="Yes";

//  HashMap<Long,Integer>map;
//      for(int i=0;i<n;i++){
//          map[a1[i]]=1;
//      }
//      for(int i=0;i<m;i++){
//          if(map[a2[i]!=1] )return "No";
//      }
//      return "Yes";
//     }
//       int count=0;
//       for(int i=0;i<m;i++){ 
//       for(int j=0;j<n-1;j++){
//           if(!arr.contains(a2[i]) && a2[i]==a1[j]){
//               arr.add((int)a2[i]);
//               count++;
//           }
//           else if(arr.contains(a2[i])){
//               if(a2[i]==a1[j+1]){
//                   count++;
//               }
//               else{
//                   count--;
//               }
//           }
         
//         }
//     }
//     return isFlag;
// }
      
      
    //   }if(count>=5){
    //      isFlag="Yes";
    //   }
    //   else{
    //     isFlag= "No";
    //   }
    //  return isFlag;
       
    //    int i = 0;
    //     int j = 0;
    //     for (i = 0; i < m; i++) {
    //         for (j = i; j < n; j++)
    //             if (a2[i] == a1[j])
    //                 break;
 
    //         /* If the above inner loop
    //         was not broken at all then
    //         arr2[i] is not present in
    //         arr1[] */
    //         if (j != m)
    //           isFlag="Yes";
               
    //             else{
    //          isFlag="No";
    //     }
    //     }
       
    //     /* If we reach here then all
    //     elements of arr2[] are present
    //     in arr1[] */
      
    //   return isFlag;
   }

   public static int find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
      int count =0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(A[i]+A[j]+A[k]==X){
                    count++;           
                }
            }
        }
    }
    return count;
    }
}
