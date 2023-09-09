import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        infixToPostfix("a+b-c/d*e");
    }
    public static void infixToPostfix(String exp){
        ArrayDeque<Character> stack=new ArrayDeque<>();
        String postfix="";
        HashMap<Character,Integer> precedence=new HashMap<>();
        precedence.put('+',1);
        precedence.put('-',1);
        precedence.put('*',2);
        precedence.put('/',2);
        int i=0;
        while (i<exp.length()){
            if(checkKey(exp.charAt(i),precedence)){
                if(stack.isEmpty()||precedence.get(exp.charAt(i))>precedence.get(stack.peek())){
                    stack.push(exp.charAt(i++));
                }
                else{
                    postfix+=stack.pop();
                }
            }
            else{
                postfix+=exp.charAt(i++);
            }
        }
        while (!stack.isEmpty()){
            postfix+=stack.pop();
        }
        System.out.println(postfix);
    }

    public static boolean checkKey(char c, HashMap<Character,Integer> precedence){
        for(Map.Entry<Character,Integer> l:precedence.entrySet()){
            if(l.getKey()==c){
                return true;
            }
        }
        return false;
    }

}
