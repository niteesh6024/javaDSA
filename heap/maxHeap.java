
/*
heap sort:
1. create a heap
2. delete the elements one by one
3. store the deleted elements in the non heap part then it become sorted
 */

public class Main {
    static int p=0;
    public static void insertHeap(int[] mH, int v){
        p++;
        mH[p-1]=v;
        int i=p;
        while(i-1>0&&v>mH[i/2-1]){
            mH[i-1]=mH[i/2-1];
            i/=2;
        }
        mH[i-1]=v;
    }

    public static void delete(int[] mH){

        int v=mH[p-1];
        mH[p-1]=mH[0];
        mH[0]=v;
        int i=0;int j=i*2+1;
        while(j<p-2){
            if(mH[j+1]>mH[j])
                j+=1;
            if(mH[i]<mH[j]){
                mH[i]=mH[j];
                mH[j]=v;
                i=j;
                j=i*2+1;
            }
            else {
                break;
            }
        }
        p--;
    }

    public static void main(String[] args) {
        int[] maxHeap=new int[]{102,2,4,55,32,46,75};

        for(int i :maxHeap)
            insertHeap(maxHeap,i);


        for(int i:maxHeap)
            System.out.print(i+" ");

        for(int i:maxHeap)
            delete(maxHeap);
        System.out.println();
        for(int i:maxHeap)
            System.out.print(i+" ");

    }
}
