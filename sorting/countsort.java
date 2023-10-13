import java.util.*;

public class Main {

    public static void countSort(int[] a) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        int[] hash=new int[max+1];
        for(int i:a)
            hash[i]++;
        int j=1,i=0;
        while(j<hash.length){
            if(hash[j]>0){
                a[i++]=j;
                hash[j]--;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]=new int[]{1,3,5,5,4,6};
        countSort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
