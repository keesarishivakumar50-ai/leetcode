class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0 ;
        int res = 0;
        int[] h = new int[26];
        int i = 0;
        for(int j = 0 ; j < s.length() ; j++){
            h[s.charAt(j) - 'A']++;
            max = Math.max(max ,h[s.charAt(j) - 'A']);
            while(j - i + 1 > k + max){
                h[s.charAt(i) - 'A']--;
                i++;
            }
            res = Math.max(max , j - i + 1);
        }
        return res; 
    }
}