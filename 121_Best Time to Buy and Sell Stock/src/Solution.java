/**
 * 思路：
 * 遍历一遍 遇到比当前价格小的时候则作为买入价格，
 * 超过这个价格的时候（说明可以作为卖出价格），则计算当前的利润然后更新利润为最大。
 */
class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) { // 说明价格低 可以买入
                min = prices[i];
            } else { // 价格高 可以考虑卖出
                if (profit < prices[i] - min) {
                    // 更新卖价
                    profit = prices[i] - min;
                }
            }
        }

        return profit;
    }

}