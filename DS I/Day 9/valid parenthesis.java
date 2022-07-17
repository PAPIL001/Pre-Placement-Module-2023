class Solution {
    public boolean isValid(String s) {
        List<Character> list= new ArrayList<Character>();
        list.add('a');
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int a = -1;
            if(c == '('){
                a1++;
            }
            else if(c == '['){
                a2++;
            }
            else if(c == '{'){
                a3++;
            }
            else if(c == ')'){
                a = list.lastIndexOf('(');
                a1--;
            }
            else if(c == ']'){
                a = list.lastIndexOf('[');
                a2--;
            }
            else if(c == '}'){
                a = list.lastIndexOf('{');
                a3--;
            }           
            if(a != -1){
                for(int j=a; j<=list.size(); j++){
                    //System.out.println(j);
                    list.remove(a);
                }
            } else{
                if(c==')' || c==']' || c== '}'){
                    return false;
                }
                list.add(c);
            }
            if(a1<0 || a2<0 || a3<0){
                return false;
            }
        }
        if(a1!=0 || a2!=0 || a3!=0){
            return false;
        }
        if(list.size() == 1){
            return true;
        }
        return false;
    }
}