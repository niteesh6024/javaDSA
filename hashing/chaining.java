//open hashing
import java.util.*;

public class Main {
    static TreeSet<Integer>[] hash=new TreeSet[10];
    public static void insert(int n) {
        int i=n%10;
        if (hash[i] == null) {
            hash[i] = new TreeSet<Integer>();
        }
        hash[i].add(n);
    }

    public static boolean search(int n){
        int i=n%10;
        TreeSet<Integer> t=hash[i];
        if(t==null){
            return false;
        }
        Iterator it =t.iterator();
        while(it.hasNext()){
            if((int)it.next()==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        insert(2);insert(24);insert(12);insert(8);insert(32);
        System.out.println(search(24));
    }
}
