import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scn.nextLine();
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else if (ch == ')') {
               boolean val = handleClosingBracket(st, '(');
               if(val == false){
                System.out.println(val);
                return;
               }
            }else if (ch == '}') {
               boolean val =  handleClosingBracket(st, '{');
               if(val == false){
                System.out.println(val);
                return;
               }
            }else if (ch == ']'){
               boolean val = handleClosingBracket(st, '[');
               if(val == false){
                System.out.println(val);
                return;
               }
            }else{
                
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean handleClosingBracket(Stack<Character>st,char ch){
        if(st.size()==0){
            return false;
        }else if (st.peek() != '(') {
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}