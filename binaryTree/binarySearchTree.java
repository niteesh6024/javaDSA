import java.util.Scanner;
import java.util.*;

class Node{
    Node left;
    int val;
    Node right;
    public Node next;
    Node(int val){
        this.val=val;
    }
}

public class Main {
    public static void main(String[] args) {
        Node root=insert(null,5);
        insert(root,7);
        insert(root,3);
        insert(root,9);
        insert(root,2);
        System.out.println(search(root, 9));
        System.out.println(search(root, 9));
    }

    public static Node insert(Node root, int v){
        if(root==null){
            root=new Node(v);
            return root;
        }
        if(v<root.val){
           root.left= insert(root.left,v);
        }
        else if(v>root.val){
            root.right= insert(root.right,v);
        }
        return root;
    }

    public static boolean search(Node root, int v){
        if(root==null){
            return false;
        }
        if(v==root.val){
            return true;
        } else if (v<root.val) {
            return search(root.left,v);
        }
        else{
            return search(root.right,v);
        }
    }

    public static Node delete(Node root,int v){
        if(root==null){
            return null;
        }

        if(root.left==null&&root.right==null){
            return null;
        }

        if(v<root.val){
            root.left= delete(root.left,v);
        }
        else if(v>root.val){
            root.right= delete(root.right,v);
        }
        else {
            if(height(root.left)>height(root.right)){
                Node l=insucc(root.left);
                root.val=l.val;
                root.left=delete(root.left,l.val);
            }
            else{
                Node r=inpre(root.right);
                root.val=r.val;
                root.right=delete(root.right,r.val);
            }
        }
        return root;
    }
    public static Node insucc(Node root){
        if(root.right==null){
            return root;
        }
        return insucc(root.right);
    }
    public static Node inpre(Node root){
        if(root.left==null){
            return root;
        }
        return insucc(root.left);
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
