/**
 * 思路：
 * 使用异或操作
 * 异或满足 交换律 a^b = b^a 且相同元素异或值为0 a^a = 0 且 a^0 = a
 */
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i]; // 异或
        }

        return ans;
    }
}