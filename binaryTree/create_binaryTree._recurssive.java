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
    public static Node binaryTree(Scanner sc){
        int val=sc.nextInt();
        if(val==-1){
            return null;
        }
        Node t=new Node(val);
        System.out.print("enter the left child of " +val+": ");
        t.left=binaryTree(sc);
        System.out.print("enter the right child of " +val+": ");
        t.right=binaryTree(sc);
        return t;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the root val: ");
        binaryTree(sc);
    }
}
