import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        parenthesisCheck("(niteesh[satya{sai})]");
    }
    public static void parenthesisCheck(String exp){
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='('||exp.charAt(i)=='['||exp.charAt(i)=='{'){
                stack.offerLast(exp.charAt(i));
            } else if (exp.charAt(i)==']'||exp.charAt(i)=='}'||exp.charAt(i)==')') {
                if(stack.isEmpty()==true){
                    System.out.println("not balanced");
                    return;
                }
                if(checklast(exp.charAt(i),stack.peekLast())){
                    stack.removeLast();
                }
            }
        }
        System.out.println(stack.isEmpty()==true?"balanced":"not balanced");
    }
    public static boolean checklast(char e,char p){
        if((int)e - (int)p == 1 || (int)e - (int)p == 2){
            return true;
        }
        else {
            return false;
        }
    }
}
