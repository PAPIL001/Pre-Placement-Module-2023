class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0;
        int left=0;
        Set<Character> st=new HashSet();
        int max=0;
        
        while(right<s.length())
        {
            char c=s.charAt(right);
            if(st.add(c)){
               max= Math.max(max,right-left+1);
                right++;
            }
            else{
                while(s.charAt(left)!=c){
                    st.remove(s.charAt(left));
                    left++;
                }
                st.remove(c);
                    left++;
            }
}
        return max;
    }
}