import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("({}[]"));
        System.out.println(solution.isValid("[({]})"));

    }
}

class Solution {
    public boolean isValid(String s) {

        int roundCount = 0;
        int curlyCount = 0;
        int squareCount = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {

                case '(':
                    roundCount++;
                    break;
                
                case ')':
                    roundCount--;
                    break;
                
                case '{':
                    curlyCount++;
                    break;

                case '}':
                    curlyCount--;
                    break;
                
                case '[':
                    squareCount++;
                    break;

                case ']':
                    squareCount--;
                    break;

            }

            // System.out.println("round: " + roundCount);
            // System.out.println("c: " + curlyCount);
            // System.out.println("s: " + squareCount);


            if (roundCount < 0 || curlyCount < 0 || squareCount < 0) {
                return false;
            }
        }

        return roundCount + curlyCount + squareCount == 0;

    }
}