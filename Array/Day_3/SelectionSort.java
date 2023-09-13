package Array.Day_3;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,4,5,3,2};
        selection(arr);
    }
    static void selection(int num[]){
        for(int i=0;i<num.length;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
            int tem=num[min];
            num[min]=num[i];
            num[i]=tem;

        }

        for(int a:num){
        System.out.println(a);
        }
    }
}
