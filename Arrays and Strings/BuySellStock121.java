public class BuySellStock121 {

    public static void main(String[] args) {
        
        Solution solution = new Solution();

        int[] test1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(test1));
    }

}

class Solution {
    public int maxProfit(int[] prices) {

        int currMin = prices[0];
        int minIndex = 0;
        int currMax = prices[0];
        int maxIndex = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int currPrice = prices[i];

            if (currPrice < currMin) {
                if (minIndex < maxIndex) {
                    maxProfit = maxProfit > currMax - currMin ? maxProfit : currMax - currMin;
                }
                currMin = currPrice;
                minIndex = i;
            } else if (currPrice > currMin) {
                if (maxIndex <= minIndex) {
                    currMax = currPrice;
                    maxIndex = i;
                } else if (currMax < currPrice) {
                    currMax = currPrice;
                    maxIndex = i;
                }
            }

        }

        if (minIndex < maxIndex) {
            maxProfit = maxProfit > currMax - currMin ? maxProfit : currMax - currMin;
        }

        return maxProfit;
    }
}
