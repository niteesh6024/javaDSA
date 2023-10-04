/*
heapfiy will take O(n)
we will travel from the leaf to root 
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] hp=new int[]{5,10,30,20,35,40,15};
        int p=hp.length;int t,v,s;
        while(p>0){
            if(p*2>hp.length){
                p--;
                continue;
            }
            t=p;
            while(t*2<=hp.length){
                if(hp[t*2-1]>hp[t*2])
                    v=t*2-1;
                else
                    v=t*2;
                if(hp[t-1]<hp[v]){
                    s=hp[v];
                    hp[v]=hp[t-1];
                    hp[t-1]=s;
                    t=v+1;
                }
                else{
                    break;
                }
            }
            p--;
       }
        for(int i:hp){
            System.out.print(i+" ");
        }
    }
}
