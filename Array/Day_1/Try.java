package Array.Day_1;

import java.security.Timestamp;

public class Try {
    private static String barcode;
    private static Try createdTS;
    private static int weightTgt;
    private static int weightMin;
    private static int weightMax;
    public Try(long l) {
        // Initialize createdTS with the current timestamp
        Try.createdTS = new Try(System.currentTimeMillis());
    }
    public static void main(String[] args) {
        int count=1;
        if(count==0){
System.out.println("Hi");
        }
        else{
            String barcode="Hi";
            Try s=Try.createdTS;
            int weightTgt=4;
            int weightMin=10;
            int weightMax=50;
        Try t= new Try(barcode,s,weightTgt,weightMin,weightMax);
            System.out.println( t.barcode);
            System.out.println(s);
        }}

    // public static String getBarcode() {
    //     return barcode;
    // }

    // public static void setBarcode(String barcode) {
    //     Try.barcode = barcode;
    // }

    public Try(String barcode, Try s, int weightTgt, int weightMin, int weightMax) {
        this.barcode = barcode;
        this.createdTS = s;
        this.weightTgt = weightTgt;
        this.weightMin = weightMin;
        this.weightMax = weightMax;
    }
}
