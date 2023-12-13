import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> profitDeadline=new HashMap<>();
        profitDeadline.put(25,2);
        profitDeadline.put(20,1);
        profitDeadline.put(10,2);
        profitDeadline.put(15,3);
        profitDeadline.put(5,3);
        int m=Integer.MIN_VALUE;
        for(int i: profitDeadline.values()){
            m=m<i?i:m;
        }
        int[] job=new int[m];

        for(Map.Entry<Integer,Integer> v:profitDeadline.entrySet()){

            int p=v.getKey();
            int d=v.getValue();
//            System.out.println(p);
            while(d>0){
                if(job[d-1]<p){
                    int t=job[d-1];
                    job[d-1]=p;
                    p=t;
                }
                d--;
            }
        }

        for(int i:job){
            System.out.println(i);
        }

    }
}
