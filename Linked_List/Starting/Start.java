package Linked_List.Starting;

import java.util.Scanner;

public class Start {
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int volume=(int) Math.pow(a, 3);
    int Surface_Area=6* (int) Math.pow(a, 2);
    System.out.print(Surface_Area);
    System.out.print(volume);
}
}
