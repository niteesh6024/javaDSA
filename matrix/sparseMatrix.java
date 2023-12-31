
import java.util.Scanner;
import java.util.*;

 class SparseMatrix{
     private int n;
     private LinkedList<LinkedList<Integer>> ll=new LinkedList<LinkedList<Integer>>();
     SparseMatrix(int r, int c){
         LinkedList<Integer> l=new LinkedList<>(List.of(r,c,0));
         ll.add(l);

     }
  public void set(int r,int c,int v){
        LinkedList<Integer> l=new LinkedList<>(List.of(r,c,v));
         if(ll.size()<2){
             ll.add(l);
             ll.get(0).set(2,ll.get(0).get(2)+1);
         }
         else{
            int i=1;

            while(i<ll.size()){
                if(ll.get(i).get(0)>r){
                    ll.add(i,l);
                    ll.get(0).set(2,ll.get(0).get(2)+1);
                    break;
                }
                else if (ll.get(i).get(0)==r) {
                    if(ll.get(i).get(1)>c){
                        ll.add(i,l);
                        ll.get(0).set(2,ll.get(0).get(2)+1);
                        break;
                    }
                    else if(ll.get(i).get(1)<c){
                        ll.add(l);
                        ll.get(0).set(2,ll.get(0).get(2)+1);
                        break;
                    }
                    else{
                        ll.set(i,l);
                        break;
                    }
                }
                else{
                    i++;
                }
            }
            if(i==ll.size()){
                ll.add(l);
                ll.get(0).set(2,ll.get(0).get(2)+1);
            }
         }

    }

    public void get(){
         int r=ll.get(0).get(0), c=ll.get(0).get(1);
         Iterator<LinkedList<Integer>> it=ll.iterator();
         LinkedList<Integer> d = it.next();d=it.next();
         for(int i=0;i<r;i++){
                 //System.out.println(d);
                 for (int j = 0; j < c; j++) {
                     if(d.get(0)==i && d.get(1)==j){
                         System.out.print(d.get(2));
                         if(it.hasNext()) {
                            d=it.next();}
                     }
                     else{
                         System.out.print(0);
                     }
                 }System.out.println();

         }

    }

}

public class Main {
    public static void main(String[] args) {
        SparseMatrix sm=new SparseMatrix(6,5);
        sm.set(1,3,5);
        sm.set(0,3,5);
        sm.set(0,2,5);
        sm.set(5,3,7);
        sm.set(4,4,4);
        sm.set(3,2,1);
        sm.get();
    }
}
