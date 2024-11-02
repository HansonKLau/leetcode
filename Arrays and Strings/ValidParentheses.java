import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("({}[]")); // false
        System.out.println(solution.isValid("({[]})")); // true
        System.out.println(solution.isValid("([)]")); // false
        System.out.println(solution.isValid("()[]{}")); // true

    }
}

class Solution {
    public boolean isValid(String s) {

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char currChar = s.charAt(i);

            switch (currChar) {

                case '(':

                case '[':

                case '{':

                    charStack.push(currChar);
                    break;
                
                case ')':

                    if (charStack.isEmpty() || charStack.peek() != '(') {
                        return false;
                    } 

                    charStack.pop();
                    break;
                
                case ']':

                    if (charStack.isEmpty() || charStack.peek() != '[') {
                        return false;
                    }

                    charStack.pop();
                    break;

                case '}':

                    if (charStack.isEmpty() || charStack.peek() != '{') {
                        return false;
                    }

                    charStack.pop();
                    break;
            }
        }

        return charStack.empty();

    }
}