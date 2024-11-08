public class StringCompressionIII3163 {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.compressedString("aaabbbccc"));
    }
    
}


class Solution {
    public String compressedString(String word) {

        StringBuilder comp = new StringBuilder();

        int countOfCurrChar = 1;
        char prevChar = ' ';

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (prevChar == c) {
                countOfCurrChar++;
            } else if (prevChar != ' ') {
                comp.append(Integer.toString(countOfCurrChar) + prevChar);
                countOfCurrChar = 1;
            }

            if (countOfCurrChar == 9) {
                comp.append("9" + c);
                countOfCurrChar = 1;
                prevChar = ' ';
            } else {
                prevChar = c;
            }
        }

        if (prevChar != ' ') {
            comp.append(Integer.toString(countOfCurrChar) + prevChar);
        }

        return comp.toString();
        
    }
}