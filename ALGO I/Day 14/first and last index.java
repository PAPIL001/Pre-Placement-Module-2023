class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int a[]={-1,-1};
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {a[0]=mid;
             h=mid-1;}
            else if(target>nums[mid])
                l=mid+1;
            else
                h=mid-1;
        }
        l=0;
        h=nums.length-1;
         while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {a[1]=mid;
             l=mid+1;}
            else if(target>nums[mid])
                l=mid+1;
            else
                h=mid-1;
        }
            return a;
    }
}