package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;
import java.util.List;

public class Generate_para {
    
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static  List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        Ret(s,0,0,"",n);
        return s;
    }

    static void Ret(List<String> s,int left,int right,String str,int n){
        if(str.length()==n*2){
            s.add(str);
           return;
        }
        if(left<n){
            Ret(s,left+1,right,str+"(",n);
        }
        if(right<left){
                  Ret(s,left,right+1,str+")",n);
        }

    }
}
