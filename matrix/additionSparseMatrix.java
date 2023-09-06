import java.util.Scanner;
import java.util.*;
class SparseMatrix{
     private int n;
     public LinkedList<LinkedList<Integer>> ll=new LinkedList<LinkedList<Integer>>();
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
                         System.out.print(d.get(2)+" ");
                         if(it.hasNext()) {
                            d=it.next();}
                     }
                     else{
                         System.out.print(0+" ");
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
        System.out.println();
        SparseMatrix sm2=new SparseMatrix(6,5);
        sm2.set(1,3,5);
        sm2.set(0,3,10);
        sm2.set(0,2,5);
        sm2.set(5,3,7);
        sm2.set(4,4,4);
        sm2.set(3,2,1);
        sm2.get();

        SparseMatrix sm3=new SparseMatrix(6,5);

        int p1=1,p2=1;
        while(p1<sm.ll.size() && p2<sm2.ll.size() ){
            if(sm.ll.get(p1).get(0)==sm2.ll.get(p2).get(0)){
                if(sm.ll.get(p1).get(1)==sm2.ll.get(p2).get(1)){
                    sm3.set(sm.ll.get(p1).get(0),sm.ll.get(p1).get(1),sm.ll.get(p1).get(2)+sm2.ll.get(p2).get(2));

                    p1++;p2++;
                }
                else if(sm.ll.get(p1).get(1)<sm2.ll.get(p2).get(1)){
                    sm3.set(sm.ll.get(p1).get(0),sm.ll.get(p1).get(1),sm.ll.get(p1).get(2));
                    p1++;
                }
                else{
                    sm3.set(sm2.ll.get(p2).get(0),sm.ll.get(p2).get(1),sm.ll.get(p2).get(2));
                    p2++;
                }
            }
            else if (sm.ll.get(p1).get(0)<sm2.ll.get(p2).get(0)) {
                sm3.set(sm.ll.get(p1).get(0),sm.ll.get(p1).get(1),sm.ll.get(p1).get(2));
                p1++;
            }
            else{
                sm3.set(sm2.ll.get(p2).get(0),sm.ll.get(p2).get(1),sm.ll.get(p2).get(2));
                p2++;
            }
        }
        System.out.println(p1);
        sm3.get();

    }
}
