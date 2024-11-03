
public class RotateString796 {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.rotateString("abc", "bca"));
    }
}

class Solution {
    public boolean rotateString(String s, String goal) {

        // StringBuilder rotatingString = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

            if (s.equals(goal)) {
                return true;
            } else {

                s = s.substring(1) + s.charAt(0);

            }
        }
        return false;
    }
}