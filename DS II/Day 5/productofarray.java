class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int total = 0;
        int flag=0;
        for(int i=0;i<n;i++) {
            if(nums[i]==0) {
                flag++;
                continue;
            } 
            else if(total==0) total=nums[i];
            else total*=nums[i];
        }
        int[] ans=new int[n];
        if(flag>1) return ans;
        for(int i=0;i<n;i++) {
            if(flag==1 && nums[i]!=0) ans[i]=0;
            else if(flag==1 && nums[i]==0) ans[i]=total;
            else ans[i]=total/nums[i];
        }
        return ans;
    }
}