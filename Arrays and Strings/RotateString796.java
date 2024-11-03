
public class RotateString796 {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.rotateString("abc", "bca"));
    }
}

class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if ((s+s).contains(goal)) {
            return true;
        } else {
            return false;
        }
    }
}