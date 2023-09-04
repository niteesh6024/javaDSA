
import java.util.Scanner;
import java.util.*;

 class Diagonal{
     private int n; int[] m;
     private ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();;
     Diagonal(int n){
         this.n=n;
         ArrayList<Integer> ali ;
         for(int i=1;i<=n;i++){
             ali=new ArrayList<>();
             for(int j=0;j<i;j++){
                 ali.add(0);
             }
             al.add(ali);
         }

     }
    public void set(int i,int j,int n){
         al.get(i-1).set(j-1,n);
    }
    public int get(int i, int j){
         return al.get(i-1).get(j-1);
    }
    public void display(){
         Iterator iti;
         int i=0;
         while(i<al.size()){
             iti=al.get(i).iterator();
             int j=0;
             while(j++<al.size()){
                 if(iti.hasNext())
                    System.out.print(iti.next());
                 else
                     System.out.print(0);
             }
             System.out.println();i++;
         }
    }

}

public class Main {
    public static void main(String[] args) {
        Diagonal d = new Diagonal(5);
        for(int i=1;i<=5;i++){
            d.set(i,i,i);
        }
        d.set(2,1,6);
        d.set(2,1,6);
        d.set(3,2,8);
        d.set(4,1,4);
        d.set(5,3,6);
        d.display();
    }
}
