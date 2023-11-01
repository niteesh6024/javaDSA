/*
1. find the edge with less weight from the graph
2. update the near array which contains the short vertex(from less weight edge) for all the vertex(index)
3. select the shortest vertex which is nearier to the selected vertexes
4. 
 */
import com.sun.jdi.event.EventIterator;

import java.util.*;

public class Main {
    
    public static void prims(int[][] g){
        int []near=new int[g.length];
        int [][]shortest=new int[2][g.length-2];
        int min=Integer.MAX_VALUE,u=1,v=1;
        for(int i=1;i<g.length;i++){
            for(int j=i+1;j<g.length;j++){
                if(g[i][j]<min){
                    min=g[i][j];
                    u=i;
                    v=j;
                }
            }
        }
        shortest[0][0]=u;
        shortest[1][0]=v;
        near[u]=0;near[v]=0;
        for(int i=1;i<=7;i++){
            if(i==u||i==v)
                continue;
            if((g[u][i]<g[v][i])){
                near[i]=u;
            }
            else {
                near[i]=v;
            }
        }
        int k=0;

        for(int i=1;i<6;i++){
            min=Integer.MAX_VALUE;
            for(int j=1;j<=7;j++){
                if((near[j]!=0)&&g[j][near[j]]<min){
                    min=g[j][near[j]];
                    k=j;
                }
            }
            shortest[0][i]=k;
            shortest[1][i]=near[k];
            near[k]=0;
            for(int j=1;j<=7;j++){
                if((near[j]!=0)&&g[j][near[k]]<g[j][near[j]]){
                    near[j]=k;
                }
            }
        }
        for(int x=0;x<shortest[0]   .length;x++){
            System.out.println(shortest[0][x]+" "+shortest[1][x]);
        }
    }

    public static void main(String[] args) {
        int m=Integer.MAX_VALUE;
        int [][]g= new int[][]{
                {0,0,0,0,0,0,0,0},
                {0,m,25,m,m,m,5,m},
                {0,25,m,12,m,m,m,10},
                {0,m,12,m,8,m,m,m},
                {0,m,m,8,m,16,m,14},
                {0,m,m,m,16,m,20,18},
                {0,5,m,m,m,20,m,m},
                {0,m,10,m,14,18,m,m}
        };
        prims(g);
    }
}
