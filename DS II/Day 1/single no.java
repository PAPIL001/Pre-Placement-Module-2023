class Solution {
    public int singleNumber(int[] nums) {
        
        ArrayList<Integer> store = new ArrayList<Integer>();
        
        for(int i : nums){
            
            if(store.contains(i))
                store.removeAll(Collections.singleton(i));
            else
                store.add(i);
            
        }
        return store.get(0);
    }
}