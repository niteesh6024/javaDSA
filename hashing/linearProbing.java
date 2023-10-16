//closed hashing
import java.util.*;

public class Main {
    static int[] hash=new int[10];
    public static void insert(int n) {
        int i,k=0;
        while(true){
            i=(n%10+k)%10;
            if(hash[i]!=0){
                k++;
            }
            else{
                hash[i]=n;
                break;
            }
        }
    }

    public static boolean search(int n){
        int i,k=0;
        while(true){
            i=(n%10+k)%10;
            if(hash[i]==n){
                return true;
            }
            else if(hash[i]==0){
                return false;
            }
            else{
                k++;
            }
        }
    }

    public static void main(String[] args) {
        insert(2);insert(24);insert(12);insert(8);insert(32);
        for (int i:hash)
            System.out.println(i);
        System.out.println(search(24));

    }
}
