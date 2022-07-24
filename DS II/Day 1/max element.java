class Solution {
   public int majorityElement(int[] nums) {
        int count = 0;
        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maxCount = nums[i];
            }
            if (nums[i] == maxCount) {
                count = count + 1;
            } else {
                count = count - 1;
            }
        }
        return maxCount;
    }
}