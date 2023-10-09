/*
bubble sort:
    1. no. of comparions: n(n-1)/2
    2. no. of swaps: n
    3. adaptive(if sorted it will stop): no 
    4. stable(same elements can be swapped): no
 */
import java.util.*;

public class Main {
    public static void bubbleSort(int[] n,int s) {
        int k,t;
        for(int i=0;i<s;i++){
            k=i;
            for(int j=i+1;j<s;j++){
                if(n[k]>n[j])
                    k=j;
            }
            t=n[i];
            n[i]=n[k];
            n[k]=t;
        }
    }
    public static void main(String[] args) {
        int n[]=new int[]{5,2,7,6,4,3,6};
        bubbleSort(n,n.length);
        for(int i:n){
            System.out.println(i);
        }
    }
}
