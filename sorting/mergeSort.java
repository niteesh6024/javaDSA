/*
bubble sort:
    1. no. of comparions: n(n-1)/2
    2. no. of swaps: n
    3. adaptive(if sorted it will stop): n(logn)
    4. stable(same elements can be swapped): yes
 */
import java.util.*;

public class Main {
    public static void merge(int a[],int l,int m,int h){
        int i=l,j=m+1,k=l;
        int[] b=new int[h+1];
        while (i<=m&&j<=h){
            if(a[i]<a[j])
                b[k++]=a[i++];
            else
                b[k++]=a[j++];
        }
        for(;i<=m;i++)
            b[k++]=a[i++];
        for(;j<=h;j++)
            b[k++]=a[j++];
        for(int c=l;c<=h;c++){
            a[c]=b[c];
        }
    }
    public static void mergeSort(int[] a,int l,int h) {
        int m;
        if(l<h){
            m=(l+h)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,h);
            merge(a,l,m,h);
        }

    }
    public static void main(String[] args) {
        int a[]=new int[]{1,3,5,2,4,6};
        mergeSort(a,0,a.length-1);
        //merge(a,0,(a.length-1)/2,a.length-1);
        for(int i:a){
            System.out.println(i);
        }
    }
}
