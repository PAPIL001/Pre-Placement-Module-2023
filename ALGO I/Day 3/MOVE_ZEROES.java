class Solution {
    public void moveZeroes(int[] nums) {
        int a[]=new int[nums.length];
        int j=nums.length-1;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {a[j]=nums[i];
             j--;}
            else
            {a[k]=nums[i];
             k++;}
            
}
       for(int i=0;i<nums.length;i++)
       {
           nums[i]=a[i];
       }
        
    }
}