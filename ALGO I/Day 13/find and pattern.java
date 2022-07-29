class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList<>();
        
        for(String word:words){
            if(matches(word,pattern)==true)
                result.add(word);
            
        }
        return result;
    }
    public boolean matches(String word, String pattern){
        char[] a2b=new char[26];
        char[] b2a=new char[26];
        
        for(int i=0;i<word.length();i++){
            char wordchar=word.charAt(i);
            char pattchar=pattern.charAt(i);
            if(a2b[pattchar-'a']==0)
                a2b[pattchar-'a']=wordchar;
            if(b2a[wordchar-'a']==0)
                b2a[wordchar-'a']=pattchar;
            
            if(a2b[pattchar-'a']!=wordchar || b2a[wordchar-'a']!=pattchar)
                return false;
            
        }
         return true;
    }
   
}