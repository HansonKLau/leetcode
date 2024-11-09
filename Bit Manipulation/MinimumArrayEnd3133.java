
public class MinimumArrayEnd3133 {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        System.out.println(solution.minEnd(2, 7));
    }


}

class Solution {
    public long minEnd(int n, int x) {

        long result = x;
        long remaining = n - 1;
        long position = 1;
        
        while (remaining != 0) {
            // System.out.println("pos: " + position);
            if ((x & position) == 0) {
                // System.out.println("rem: " + remaining);
                // System.out.println("res1: " + result);
                result |= (remaining & 1) * position;
                // System.out.println("res2: " + result);
                remaining >>= 1;
            }
            position <<= 1;

        }
        
        return result;
        
    }
}