/*
1. find the least weighted edge
2. find whether the selected edges forms a cycle with the result
3. then find the weighted union
4. repeat 1, 2, 3
 */
import com.sun.jdi.event.EventIterator;

import java.util.*;

public class Main {

    public static int find(int[] set,int n){

        while(set[n]>0){
            n=set[n];
        }

        return n;
    }

    public static void weightedUnion(int u,int v,int[] set){

        if(set[u]<set[v]){
            set[u]+=set[v];
            set[v]=u;
        }
        else {
            set[v]+=set[u];
            set[u]=v;
        }
    }
    public static void kruskals(int [][]g){
        int []set=new int[]{-1,-1,-1,-1,-1,-1,-1,-1};
        int[][] result=new int[2][6];
        int []include=new int[9];
        int t=0;
        while(t<6) {
            int min =Integer.MAX_VALUE;
            int k = 0;
            for (int i = 0; i < g[2].length; i++) {
                if (include[i] == 0 && g[2][i] < min) {
                    min = g[2][i];
                    k = i;
                }
            }
            int u = find(set, g[0][k]);
            int v = find(set, g[1][k]);
            if (u != v) {
                result[0][t]=g[0][k];
                result[1][t]=g[1][k];
                weightedUnion(u,v,set);
                t++;
            }
            include[k]=1;
        }

        for(int i=0;i<result[0].length;i++){
            System.out.println(result[0][i]+" "+result[1][i]);
        }
    }

    public static void main(String[] args) {
        int m=Integer.MAX_VALUE;
        int [][]g= new int[][]{
                {1,1,2,2,3,4,4,5,5},
                {2,6,3,7,4,5,7,6,7},
                {25,5,12,10,8,16,14,20,18}
        };
        kruskals(g);
    }
}
