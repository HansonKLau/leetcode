public class CircularSentence2490 {
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(solution.isCircularSentence("leetcode exercises sound"));
        System.out.println(solution.isCircularSentence("elegante"));
        System.out.println(solution.isCircularSentence("ab a"));

    }
}

class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length - 1; i++) {

            if (words[i].charAt(words[i].length() - 1) != words[i+1].charAt(0)) {
                return false;
            }
        }

        String lastWord = words[words.length-1];
        String firstWord = words[0];

        return lastWord.charAt(lastWord.length() - 1) == firstWord.charAt(0);
        
    }
}