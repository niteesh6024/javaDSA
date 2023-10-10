/*
bubble sort:
    1. no. of comparions: n(n-1)/2
    2. no. of swaps: n
    3. adaptive(if sorted it will stop): based on pivot
    4. stable(same elements can be swapped): not
 */
import java.util.*;

public class Main {
    public static int partition(int a[],int l,int h){
        int lt=l,p=a[l++],t;
        while(l<=h){
            while(l<a.length&&p>=a[l]){
                l++;
            }
            while(h>=0&&p<a[h]){
                h--;
            }
            if(l<=h){
                t=a[l];a[l]=a[h];a[h]=t;}
        }
        t=a[lt];a[lt]=a[h];a[h]=t;

        return h;
    }
    public static void quickSort(int[] a,int l,int h) {
        int j;
        if(l<h){
            j=partition(a,l,h);
            quickSort(a,l,j-1);
            quickSort(a,j+1,h);
        }
    }
    public static void main(String[] args) {
        int n[]=new int[]{5,3,24,2002,2000,8,11,30};
        quickSort(n,0,n.length-1);

        for(int i:n){
            System.out.println(i);
        }
    }
}
