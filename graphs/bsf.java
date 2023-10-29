/*
1. select any vertex you want
2. then explore all its adjacent vertexs
3. then select any adjacent vertex and repeat
 */
import java.util.*;

    public static void bsf(int[][] g, int i){
        System.out.println(i);
        Deque<Integer> q=new ArrayDeque<>();
        int[] visisted=new int[g.length];
        visisted[i]=1;
        q.add(i);

        while(!q.isEmpty()){
            int u=q.remove();
            for(int v=1;v<g[u].length;v++){
                if(g[u][v]==1 && visisted[v]==0){
                    visisted[v]=1;
                    q.add(v);
                    System.out.println(v);
                }
            }
        }
    }

    public static void main(String[] args) {

        int [][]g= new int[][]{
                {0,0,0,0,0,0,0,0},
                {0,0,1,1,1,0,0,0},
                {0,1,0,1,0,0,0,0},
                {0,1,1,0,1,0,0,0},
                {0,1,0,1,0,1,0,0},
                {0,0,0,1,1,0,1,1},
                {0,0,0,0,0,1,0,0},
                {0,0,0,0,0,1,0,0}

        };
        bsf(g,5);
    }
}
