class Solution {
    List<List<Integer>> res = new LinkedList<>();
    /* return all permutations of non-repeating numbers */
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> track) {
        // terminating condition
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i=0; i<nums.length; i++) {
            if (track.contains(nums[i]))
                continue;
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
        }
    }
}