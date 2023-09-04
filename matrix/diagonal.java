import java.util.Scanner;
import java.util.*;

 class Diagonal{
     private int n;
     private int[] m;
     Diagonal(int n){
         this.n=n;
         m=new int[n];
     }
    public void set(int i,int j,int n){
         m[i-1]=(i==j)?n:0;
    }
    public int get(int i, int j){
         return i==j?m[i-1]:0;
    }
    public void display(){
         for(int i=0;i<m.length;i++){
             for(int j=0;j<m.length;j++){
                 System.out.print(i==j?m[i]:0);
             }
             System.out.println();
         }
    }
}

public class Main {
    public static void main(String[] args) {
        Diagonal d = new Diagonal(5);
        for(int i=1;i<=5;i++){
            d.set(i,i,i);
        }
        d.display();
    }
}
