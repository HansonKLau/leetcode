public class LongestCommonPrefix14 {
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] test1 = {"flower", "flow", "flight"};

        System.out.println(solution.longestCommonPrefix(test1));
    }

}

class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder longestPrefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            int minLength = longestPrefix.length() < strs[i].length() ? longestPrefix.length() : strs[i].length();

            if (minLength == 0) {
                return "";
            }

            longestPrefix.setLength(minLength);

            for (int j = 0; j < minLength; j++) {
                if (longestPrefix.charAt(j) != strs[i].charAt(j)) {
                    longestPrefix.setLength(j);
                    break;
                }
            }
        }

        return longestPrefix.toString();
    }
}
