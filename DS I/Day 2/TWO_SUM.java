class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (var i = 0; i < nums.length; i++) {
            for (var x = i + 1; x < nums.length; x++) {       
                if ((nums[i] + nums[x]) == target) {
                    return IntStream.of(i,x).toArray();
                }
            }
        }
        return null;
    }
}
