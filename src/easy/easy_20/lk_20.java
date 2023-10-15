package easy.easy_20;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class lk_20 {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        //利用栈先进后出
        //遍历字符串，遇到 ( 就将 ) 入栈，
        //如果顺序是正确的有效括号，( 后会跟着 ) 然后就会走stack.empty()||c!=stack.pop()
        //将 ) 出栈 ，这时候栈为空， 就不会返回false，继续向下遍历，直到遍历完成，返回true
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;
    }
    public static void main(String[] args) {
        String s="()[]{}";
        lk_20 lk20 = new lk_20();
        boolean valid = lk20.isValid(s);
        System.out.println(valid);
    }
}
