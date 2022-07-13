class Solution {
    public String reverseWords(String s) {
        List<String>s1=new ArrayList<String>();
        int k=0,j=0,l=0;char a;char c;
        String s2,ne="";
        for(int i=0;i<s.length();i++)
        {
            a=s.charAt(i);
            if(a==' '|| i==s.length()-1)
            { if(i==s.length()-1)
                i++;
                s1.add(k,s.substring(j,i));
                k++;
                j=i+1;
            }
        }
        for(int i=0;i<s1.size();i++)
        {
            s2=s1.get(i);
            l=s2.length();
            ne="";
            for(k=0;k<l;k++)
            {
                c=s2.charAt(k);
                ne=c+ne;
                
            }
            s1.set(i,ne);
            
        }s="";
        for(int i=0;i<s1.size();i++)
        {if(s=="")
         s=s1.get(i);
         else
            s=s+" "+s1.get(i);
            
}
        return s;
            
}
        
    }
