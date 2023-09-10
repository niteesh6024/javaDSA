import java.util.Scanner;
import java.util.*;
/*
we can represent only complete binary trees in the form array
 */
class Node{
    Node left;
    int val;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class Main {
    public static void main(String[] args) {
        Node root=new Node(5);
        Node p=root;Node t=root;
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Node> q=new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            System.out.print("enter the left child of "+ p.val);
            int l=sc.nextInt();
            if(l!=-1){
                t=new Node(l);
                q.add(t);
            }
            System.out.print("enter the left child of "+ p.val);
            int r=sc.nextInt();
            if(r!=-1){
                t=new Node(r);
                q.add(t);
            }
            q.poll();
            p=q.peek();

        }
    }
}
