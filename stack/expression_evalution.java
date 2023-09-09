import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String postfix=infixToPostfix("(5+4)*8/2");
        System.out.println(postfix);
        evalutePostfix(postfix);
    }
    public static String infixToPostfix(String exp){
        ArrayDeque<Character> stack=new ArrayDeque<>();
        String postfix="";
        HashMap<Character,Integer> inStackPrecedence=new HashMap<>();
        HashMap<Character,Integer> outStackPrecedence=new HashMap<>();
        outStackPrecedence.put('+',1);inStackPrecedence.put('+',2);
        outStackPrecedence.put('-',1);inStackPrecedence.put('-',2);
        outStackPrecedence.put('*',3);inStackPrecedence.put('*',4);
        outStackPrecedence.put('/',3);inStackPrecedence.put('/',4);
        outStackPrecedence.put('^',6);inStackPrecedence.put('^',5);
        outStackPrecedence.put('(',7);inStackPrecedence.put('(',0);
        outStackPrecedence.put(')',0);inStackPrecedence.put(')',-1);
        int i=0;
        while (i<exp.length()){
            if(checkKey(exp.charAt(i),inStackPrecedence)){
                if(stack.isEmpty()||outStackPrecedence.get(exp.charAt(i))>inStackPrecedence.get(stack.peek())){
                    stack.push(exp.charAt(i++));
                }
                else if(outStackPrecedence.get(exp.charAt(i))==inStackPrecedence.get(stack.peek())){
                    stack.pop();
                    i++;
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
        return postfix;
    }
    public static boolean checkKey(char c, HashMap<Character,Integer> precedence){
        for(Map.Entry<Character,Integer> l:precedence.entrySet()){
            if(l.getKey()==c){
                return true;
            }
        }
        return false;
    }

    public static void evalutePostfix(String postfix){
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<postfix.length();i++){
            if(postfix.charAt(i)=='+'||postfix.charAt(i)=='/'||postfix.charAt(i)=='-'||postfix.charAt(i)=='*'){
                stack.push(getResult(stack.pop(),stack.pop(),postfix.charAt(i)));
            }
            else{
                stack.push((int)(postfix.charAt(i))-48);
            }
        }
        System.out.println(stack.peek());
    }
    public static int getResult(int a,int b,char o){
        if(o=='+'){
            return a+b;
        } else if (o=='-') {
            return b-a;
        }else if (o=='*'){
            return a*b;
        }else{
            return b/a;
        }
    }
}
