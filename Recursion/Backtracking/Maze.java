package Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    
public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // Count("", 3, 3);
        // System.out.println(Counts("", 3, 3));
      //  MySol("", 1, 1);
      boolean arr[][]={{true,true,true},{true,false,true},{true,true,true}};
      MazeRestriction("", arr, 0, 0);
        // Mazes("",3, 3);
        // System.out.println(Mazess("",3, 3));
    }

    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left= count(r-1, c);
        int right= count(r, c-1);
        return left+right;
    }
    static void Count(String s,int r,int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
          Count (s+"D", r-1, c);
        }
        if(c>1){
            Count(s+"R", r, c-1);
        }

    }
    static void Mazes(String s,int r,int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1 && c>1){
            Mazes(s+"D", r-1, c-1); 
          }
        if(r>1){
          Mazes (s+"V", r-1, c);
        }
        if(c>1){
            Mazes(s+"H", r, c-1);
        }

    }
    static void MySol(String s,int r,int c){
        if(r==3 && c==3){
            System.out.println(s);
            return;
        }
        if(r<3 && c<3){
            MySol(s+"D", r+1, c+1); 
          }
        if(r<3){
            MySol (s+"V", r+1, c);
        }
        if(c<3){
            MySol(s+"H", r, c+1);
        }

    }
    static void MazeRestriction(String s,boolean arr[][],int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(s);
            return;
        }
        if(!arr[r][c]){
            return;
          }
        if(r<arr.length-1){
            MazeRestriction (s+"V", arr, r+1, c);
        }
        if(c<arr[0].length-1){
            MazeRestriction(s+"H", arr, r, c+1);
        }

    }
    static ArrayList<String> Mazess(String s,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> str= new ArrayList<>(); 
            str.add(s);
            return str;
        }
        ArrayList<String> p= new ArrayList<>(); 
        if(r>1 && c>1){
            p.addAll(Mazess(s+"D", r-1, c-1));
          }
        if(r>1){
         p.addAll( Mazess (s+"V", r-1, c));
        }
        if(c>1){
            p.addAll(Mazess(s+"H", r, c-1));
        }
       return p;
    }
    static ArrayList<String> Counts(String s,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> str= new ArrayList<>(); 
            str.add(s);
            return str;
        }
        ArrayList<String> p= new ArrayList<>(); 
        if(r>1){
         p.addAll( Counts (s+"D", r-1, c));
        }
        if(c>1){
           p.addAll( Counts(s+"R", r, c-1));
        }
       return p;
    }
}

