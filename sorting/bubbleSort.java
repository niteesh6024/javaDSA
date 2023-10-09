/*
bubble sort:
    1. no. of comparions: n(n-1)/2
    2. no. of swaps: n(n-1)/2
    3. adaptive(if sorted it will stop): true (not by nature)
    4. stable(same elements can be swapped): true
 */
import java.util.*;

public class Main {
    public static void bubbleSort(int[] n,int s) {
        int f,t;
        for(int i=s-1;i>=0;i--){
            f=0;
            for(int j=0;j<i;j++){
                if(n[j]>n[j+1]){
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                    f=1;
                }
            }
            if(f==0)
                break;
        }
    }
    public static void main(String[] args) {
        int n[]=new int[]{5,6,4,3,6};
        bubbleSort(n,5);
        for(int i:n){
            System.out.println(i);
        }
    }
}
