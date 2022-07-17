class Solution {
   public boolean isAnagram(String s, String t) {
if(s.length()!=t.length())
return false;
char[] charS = s.toCharArray();
char[] charT = t.toCharArray();

    //Sort both char arrays
    Arrays.sort(charS);
    Arrays.sort(charT);
    
    //Check if they have same char at each index.
    for(int i=0;i<charS.length;i++){
        if(charS[i]!=charT[i])
            return false;
    }
    return true;
    
}
        
    }
