
public class MaximumXOR1829 {

    public static void main(String[] args) {
        Solution solution = new Solution();


        int[] test = {0,1,1,3};

        int[] ans = solution.getMaximumXor(test, 2);

        System.out.print("ans: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

class Solution {

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ansArray = new int[nums.length];

        int xor = 0;
        int mask = (1 << maximumBit) - 1;
        for (int i = 0; i < nums.length; i++) {

            xor ^= nums[i];
            ansArray[nums.length - 1 - i] = ~xor & mask;
        }

        return ansArray;
    }
}