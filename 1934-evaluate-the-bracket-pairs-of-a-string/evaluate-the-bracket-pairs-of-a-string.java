class Solution {
    public String evaluate(String s, List<List<String>> k) {
        Map<String , String> map = new HashMap<>();
        for(List<String> str : k){
            map.put(str.get(0) , str.get(1));
        }
        int n = s.length();
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                int j = i + 1;
                while(j < n && s.charAt(j) != ')'){
                    j++;
                }
                String key = s.substring(i + 1 , j);
                str.append(map.getOrDefault(key , "?"));
                i = j;
            }
            else str.append(ch);
        }
        return str.toString();
    }
}