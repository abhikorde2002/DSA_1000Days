package Strings.Day_33;

import java.util.Scanner;

public class Tryles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
		// for(int i=0;i<n;i++){
		// 	int sq= sc.nextInt();
		// 	long ans=sq*sq;
		// 	 System.out.println(ans);
		// }
        // int n=sc.nextInt();
		// for(int i=0;i<n;i++){
		// 	int num=sc.nextInt();
		// 	int ans=0;
		// 	while(num!=0){
		// 		int digits=num%10;
		// 		ans=ans+digits;
		// 		num= num/10;
		// 	}
		// 	System.out.println(ans);
		// }
        // double p=sc.nextDouble();
		// double d= sc.nextDouble();
		// double t=sc.nextDouble();
		// double ans= (p*d*t)/100;
		//  System.out.println(ans);
        // String str= sc.nextLine();
        //  int cou=0;
        // for(int i=0;i<str.length();i++){
           
        //     String s="";
        //     if(cou!=2){
        //     String name="Ram";
        // int year=15;
   // System.out.print("Hello" + " "+sc.nextLine() + "! Next year, you will be "+"" + (sc.nextInt()+1) +" "+"years old");
//    String s="Ria";
//    int age=1996;
//     System.out.print("Hello Birthday" + " "+s + "! Your current age is "+"" + (2020-age) );
//    int cou=0;
//   // System.out.print("Hello Birthday" + " "+sc.nextLine() + "! Your current age is "+"" + (2020-sc.nextInt()) );

//    int str=sc.nextInt();
//    for(int i=0;i<=str;i++){
//      if(cou!=0){
//        int ans=sc.nextInt();
//        if(ans>7){
//            System.out.println("UP");
//        }
//        if(ans<7){
//            System.out.println("DOWN");
//        }
//        else{
//            System.out.println("EQUAL");
//        }
//    }
int num=0;
int num1=1;
int num2=0;
System.out.print(num+ "  " +num1+" ") ;
int count=1;

 withoutRec(num, num1, num2, count);
}
static void withoutRec(int num,int num1,int num2, int count){
for(int i=2;i<count;i++){
    num2=num+num1;
    num=num1;
    num1=num2;
    System.out.print("  "+num2);
}
}
  
               
        //       //  System.out.println(cou);
        //         System.out.print(str.charAt(i));
        //         cou++;
        //     }
        //     else{
        //         System.out.println();
        //         cou=1;
        //          System.out.print(str.charAt(i));
        //       //  s+=str.charAt(i);
        //     }
        //   String name="Ram";
        //         int year=15 +1;
        //           System.out.print("Hello" + " "+ name + "! Next year, you will be "+"" + (year+1) +" "+"years old");
         
        //  int arr[]=new int[4];
        //  for(int i=0;i<4;i++){
        //      arr[i]=sc.nextInt();
        //  }
        //  for(int i=0;i<4;i++){
        //     if(arr[i]%2==0){
        //         System.out.println("EVEN");
        //     }
        //     else{
        //         System.out.println("ODD");
        //     }
        //  }

         
      
        //    for(int i=0;i<4;i++){
        //        arr[i]=sc.nextInt();
        //    }
        //    for(int i=0;i<4;i++){
        //       if(arr[i]%2==0){
        //           System.out.println("EVEN");
        //       }
        //       else{
        //           System.out.println("ODD");
        //       }
        //    }
    
}
