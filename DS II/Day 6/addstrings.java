					class Solution {
public String addStrings(String num1, String num2) {
    String small="";
    String large="";
    
    if(num1.length()<num2.length())
    {
        large=num2;
        small=num1;
    }
    else
    {
        small=num2;
        large=num1;
    }
    String res="";
    int rem=0;
    int j=small.length()-1;
    for(int i=large.length()-1;i>=0;i--,j--)
    {
        int z=0;
        if(rem==1) 
        {
            z++;
            rem=0;
        }
        int x=large.charAt(i)-'0';
        int y=0;
        if(j>=0) y=small.charAt(j)-'0';
         z+=x+y;
        if(z>9)
        {
            rem=1;
            z=z-10;
        }
        res+=z;    
    }
    if(rem==1) res+="1";
    return new StringBuffer(res).reverse().toString();
    
 }
}