class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        char base = 'a';
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int ind = 26 - (ch - 'a');
            int pro = ind * (i + 1);
            sum += pro;
        }
        return sum;
    }
}