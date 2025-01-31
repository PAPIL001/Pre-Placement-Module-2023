class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            int product=0;
            if(height[left]<height[right])
            {
                product=height[left]*(right-left);
                left++;
            }
            else
            {
                product=height[right]*(right-left);
                right--;
            }
            max=Math.max(product,max);
        }
        return max;
        
    }
}