/*
1. select any vertex you want
2. then go to any one of its unvisited adjacent vertex
3. repeat 2 until you did not find any unvisited adjacent vertex
4. then move to previous visited vertex and do 3 until stack is empty
 */
import java.util.*;

public class Main {
    
    static int[] visited=new int[8];
    public static void dsf(int[][] g, int u){
        if(visited[u]==0){
            System.out.println(u);
            visited[u]=1;
            for(int v=1;v<g[u].length;v++){
                if(g[u][v]==1&&visited[v]==0){
                    dsf(g,v);
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
        dsf(g,5);
    }
}
