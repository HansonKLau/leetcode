public class DeleteCharactersToMakeFancyString {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.makeFancyString("leeetcode"));
        System.out.println(solution.makeFancyString("aaabaaaa"));

    }

}

class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder fancyString = new StringBuilder("");

        int sameCharCounter = 1;
        char prevChar = s.charAt(0);
        fancyString.append(prevChar);
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == prevChar) {
                sameCharCounter++;
            } else {
                sameCharCounter = 1;
            }

            prevChar = currentChar;

            if (sameCharCounter < 3) {
                fancyString.append(currentChar);
            }
        }

        return fancyString.toString();
    }
}