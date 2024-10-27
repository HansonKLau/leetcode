
public class FindClosestNumberToZero {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] test1 = {2,1,1,-1,100000};

        System.out.println(solution.findClosestNumber(test1));
    }
}

/*
 * 
 * Given an integer array nums of size n, return the number with the value closest to 0 in nums. 
 * If there are multiple answers, return the number with the largest value.
 * 
 */

class Solution {

    public int findClosestNumber(int[] nums) {
        int distance = Math.abs(nums[0]);
        int value = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < distance) {
                distance = Math.abs(nums[i]);
                value = nums[i];
            } else if (Math.abs(nums[i]) == distance) {
                value = Math.max(nums[i], value);
            }
        }

        // System.gc(); // <- reduces memory usage but slows runtime a bit

        return value;
    }
}