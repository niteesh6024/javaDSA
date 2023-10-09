/*
bubble sort:
    1. no. of comparions: n(n-1)/2
    2. no. of swaps: n(n-1)/2
    3. adaptive(if sorted it will stop): true (by nature)
    4. stable(same elements can be swapped): true
 */
import java.util.*;

public class Main {
    public static void insertionSort(int[] n,int s) {
        int f,t;
        for(int i=1;i<s;i++){
            t=n[i];
            int j=i-1;
            while(j>=0&&t<n[j]){
                n[j+1]=n[j];
                j--;
            }
            n[j+1]=t;
        }
    }
    public static void main(String[] args) {
        int n[]=new int[]{5,2,7,6,4,3,6};
        insertionSort(n,n.length);
        for(int i:n){
            System.out.println(i);
        }
    }
}
