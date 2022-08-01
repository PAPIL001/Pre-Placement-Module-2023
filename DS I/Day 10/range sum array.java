class NumArray {
List<Integer> a=new ArrayList<>();
    int sum=0;
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a.add(nums[i]);
}
        
    }
    
    public void update(int index, int val) {
        sum=sum+val-a.get(index);
        a.set(index,val);
        
    }
    
    public int sumRange(int left, int right) {
        int s=sum;
        for(int i=0;i<left;i++)
            s=s-a.get(i);
        for(int i=right+1;i<a.size();i++)
            s-=a.get(i);
        return s;
       
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */