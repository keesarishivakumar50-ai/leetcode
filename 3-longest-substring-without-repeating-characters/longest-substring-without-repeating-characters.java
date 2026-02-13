class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1 , i = 0;
        if(s.length() == 0) return 0;
        int[] h = new int[256];
        Arrays.fill(h,-1);
        for(int j = 0 ; j < s.length() ; j++){
            int ch = s.charAt(j);
            if(h[ch] != -1) i = Math.max(h[ch]+1 , i);
            h[ch] = j;
            max = Math.max(max , j - i + 1);
        }
        return max;
    }
}