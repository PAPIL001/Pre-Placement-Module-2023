class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        for(char ch:s.toCharArray()) {
            if(ch=='#') {
                if(!s1.isEmpty())
                    s1.pop();
            }
            else
                s1.push(ch);
        }
        for(char ch:t.toCharArray()) {
            if(ch=='#') {
                if(!t1.isEmpty())
                    t1.pop();
            }
            else
                t1.push(ch);
        }
        if(s1.size()!=t1.size())
            return false;
        while(!s1.isEmpty()) {
            if(s1.peek()!=t1.peek())
                return false;
            s1.pop();
            t1.pop();
        }
        return true;
    }
}