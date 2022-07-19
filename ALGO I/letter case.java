class Solution {
    public void helper(char[] sAry, int i, List<String> ans){
        if(i==sAry.length){
            ans.add(new String(sAry));
            return;
        }
        if(Character.isDigit(sAry[i])){
            helper(sAry, i+1, ans);
            return;   
        }
        sAry[i]=Character.toLowerCase(sAry[i]);
            helper(sAry, i+1, ans);
        sAry[i]=Character.toUpperCase(sAry[i]);
            helper(sAry, i+1, ans);
        
    }
    public List<String> letterCasePermutation(String s) {
        char[] sAry = s.toCharArray();
        List<String> ans = new ArrayList<String>();
        helper(sAry,0,ans);
        return ans;
    }
        
    
}