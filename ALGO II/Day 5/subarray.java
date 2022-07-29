class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si = 0;
        int ei = 0;
        int prod = 1;
        int maxCount = 0;
        while (ei < nums.length) {
            prod *= nums[ei];
            while (prod >= k && si <= ei) {
                prod /= nums[si];
                si++;
            }
            maxCount += ei - si + 1;
            ei++;
        }
        return maxCount;
    }
}