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

        List<Character> open = Arrays.asList('(', '{', '[');
        List<Character> close = Arrays.asList(')', '}', ']');

        HashMap<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < open.size(); i++) {
            mapping.put(open.get(i), close.get(i));
        }

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            if (open.contains(currentChar)) {
                charStack.add(currentChar);
            }

            else if (close.contains(currentChar)) {
                if (charStack.isEmpty() || currentChar != mapping.get(charStack.peek())) {
                    return false;
                } else {
                    charStack.pop();
                }
            }

        }

        return charStack.isEmpty();
    }
}