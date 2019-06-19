import java.util.Stack;
import java.util.Scanner;
public class StringMatch {

    public static void main(String args[]) {

//        System.out.println(balancedParenthensies("{(a,b)}"));
//        System.out.println(balancedParenthensies("{(a},b)"));
//        System.out.println(balancedParenthensies("{)(a,b}"));

        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(balancedParenthensies(input));
    }

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}