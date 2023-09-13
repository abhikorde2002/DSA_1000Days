package Array.Day_1;

class BuyandSell{
     public static void main(String[] args) {
        int price[]= {7,1,5,3,6,4};
        buyprice(price);
     }

     static void buyprice(int price[]){
            int buying=Integer.MAX_VALUE;
            int maxprofit=0;

            for(int i=0;i<price.length;i++){
              if(buying < price[i]){
               int profit = price[i] - buying;
                 maxprofit = Math.max( maxprofit , profit);
              }
              else{
              buying=price[i];
            }
        }
            System.out.println(maxprofit);
     }
}