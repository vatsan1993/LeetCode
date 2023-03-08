package Easy;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class P4 {
    public static boolean isValid(String s) {
        // if the string is empty, return true;
        // create a stack;
        // loop through the string
            // if the current paranthesis is closing  and the stack empty return false

            // if the the bracket is closing and the opening brace is at the top, lets pop
            // if its opening then push it into the stack.
        // at the end if the stack is empty, return true.
        Stack<Character> stack= new Stack<>();
        for(int i= 0; i< s.length(); i++){
            char ch= s.charAt(i);
            if ((ch== '}' || ch== ']'|| ch== ')') && stack.size()==0){
                return false;
            }

            if(ch== '}'  && stack.peek()== '{'){
                stack.pop();
            }
            else if(ch== ')'  && stack.peek()== '('){
                stack.pop();
            }
            else if(ch== ']'  && stack.peek()== '['){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return  stack.size()== 0;
    }

}
