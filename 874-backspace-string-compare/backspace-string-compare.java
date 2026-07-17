class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '#'){
                if(!s1.isEmpty()) s1.pop();
            }
            else s1.push(ch);
        }
        for(Character ch : t.toCharArray()){
            if(ch == '#'){
                if(!s2.isEmpty()) s2.pop();
            }
            else s2.push(ch);
        }
        return s1.equals(s2);
    }
}