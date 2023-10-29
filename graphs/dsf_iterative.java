/*
1. select any vertex you want
2. then go to any one of its unvisited adjacent vertex
3. repeat 2 until you did not find any unvisited adjacent vertex
4. then move to previous visited vertex and do 3 until stack is empty
 */
import com.sun.jdi.event.EventIterator;

import java.util.*;

public class Main {

    public static void dsf(int[][] g, int i){
        System.out.println(i);
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(i);
        int[] visited=new int[g.length];
        visited[i]=1;

        while (!stack.isEmpty()){
            int u=stack.pop();
            for(int v=1;v<g[u].length;v++){
                if(g[u][v]==1&&visited[v]==0){
                    stack.push(u);
                    stack.push(v);
                    visited[v]=1;
                    System.out.println(v);
                    break;
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
