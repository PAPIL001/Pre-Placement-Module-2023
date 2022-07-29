class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> lT;
        int pos=-1;
        // first sorting array so as to minimize number of iterations
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos=i;
                break;
            }
        }
        int len=nums.length;
		// checking for 0 as we don't need to check for positive numbers.
        for(int i=0;i<=pos;i++){
		// then fixing one element and searching for rest two.
            int temp=-nums[i];
            int start=i+1,end=len-1;
            while(start<end){
                if(nums[start]+nums[end]==temp){
                    lT=new ArrayList<>();
                    lT.add(nums[i]);
                    lT.add(nums[start]);
                    lT.add(nums[end]);
                    list.add(lT);
					// bypassing duplicate values of start and end
                    while(start<end&&nums[start]==nums[start+1])
                        start++;
                    while(start<end&&nums[end]==nums[end-1])
                        end--;
                    start++;
                    end--;
                }
                else if(nums[start]+nums[end]<temp){
                    start++;
                }
                else{
                    end--;
                }
            }
			// bypassing duplicate values of fixed element to avoid repition in list.
            while(i+1<len&&nums[i]==nums[i+1])
                i++;
        }
        return list;
    }
    
}