
import java.util.Scanner;
import java.util.*;
 class Polynomial{
     private int n;
     public ArrayList<Integer> al;
     Polynomial(){
         al=new ArrayList<>();
     }
     public void set(int i,int v){
         al.add(i,v);
     }
     public void get(){
         System.out.println(al);
     }

     public int evaluate(int x){
         int sum=0;
         for(int i=0;i<al.size();i++){
             sum+=al.get(i)*(Math.pow(x,i));
         }
         return sum;
     }
      public void add(Polynomial p1,Polynomial p2){
         int l=p1.al.size()< p2.al.size()?p2.al.size():p1.al.size();
         Iterator<Integer> it1=p1.al.iterator();
          Iterator<Integer> it2=p2.al.iterator();
          while(it1.hasNext()||it2.hasNext()){
              if(it1.hasNext()&&it2.hasNext()){
                  al.add(it1.next()+it2.next());
              }
              else if(it1.hasNext()){
                  al.add(it1.next());
              }
              else {
                  al.add(it2.next());
              }
          }
      }

}

public class Main {
    public static void main(String[] args) {
        //we can make power as index and store the cofficent at the partiular index
        Polynomial p=new Polynomial();
        p.set(0,1);
        p.set(1,4);
        p.set(2,2);
        p.set(3,1);
        p.get();
        System.out.println(p.evaluate(3));

        Polynomial p1=new Polynomial();
        p1.set(0,1);
        p1.set(1,4);
        p1.set(2,2);
        p1.set(3,1);

        Polynomial p2 =new Polynomial();
        p2.add(p,p1);
        p2.get();
    }
}
