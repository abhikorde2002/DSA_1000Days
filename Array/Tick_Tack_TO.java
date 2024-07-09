package Array;

import java.util.Scanner;

public class Tick_Tack_TO {
    public static void main(String[] args) {
        char ch[][]= new char[3][3];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                ch[i][j]=' ';
            }
        }
        char c='X';
        boolean isgameOver=false;
        Scanner scanner= new Scanner(System.in);
        while (!isgameOver) {
            printBord(ch);
            System.out.println("Player "+ c+ "enter:- ");
            int row=scanner.nextInt();
            int coll= scanner.nextInt();
            
            if(ch[row][coll]==' '){
                ch[row][coll]=c;
                isgameOver=haveWone(ch,c);
                if (isgameOver) {
                    System.out.println("Player: - " + c + "has won");
                }
                else{
                    c =(c=='X')?'O':'X';
                }
            }
            else{
                System.out.println("Invalid Move");
            }

        }
        printBord(ch);
    }

    static boolean haveWone(char[][] ch, char c) {
         for (int i = 0; i < ch.length; i++) {
            if(ch[i][0]==c && ch[i][1]==c && ch[i][2]==c){
                return true;
            }
         }  
         for (int i = 0; i < ch[0].length; i++) {
            if(ch[0][i]==c && ch[1][i]==c && ch[2][i]==c){
                return true;
            }}
            if(ch[0][0]==c && ch[1][1]==c && ch[2][2]==c){
                    return true;
                   }
                   if(ch[0][2]==c && ch[1][1]==c && ch[2][0]==c){
                        return true;
                       }     
                       
                       return false;
    }

    static void printBord(char ch[][]){
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
              System.out.print( ch[i][j]+ "|");
            }
            System.out.println();
        }
    }
}
