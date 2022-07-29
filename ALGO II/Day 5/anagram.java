class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int windowSize = p.length();
        List<Integer> ans = new ArrayList<>();
        int start =0;
        int end = windowSize;
        
        while(end<=s.length()){
            if(isAnagram(s.substring(start,end),p)){
                ans.add(start);
            }
            start++;
            end++;
        } 
        return ans;   
        
    }
    
    public boolean isAnagram(String s1, String s2){
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(char ch : s1.toCharArray()){
            arr1[ch-'a']++;
        }
        for(char ch : s2.toCharArray()){
            arr2[ch-'a']++;
        }
        
        return Arrays.equals(arr1,arr2);
        
    }
    
}