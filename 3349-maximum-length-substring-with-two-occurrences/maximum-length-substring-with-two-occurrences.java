class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0 , maxLength = 0;
        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);
            freq[ch - 'a']++;

            while(freq[ch - 'a'] > 2){
                char c = s.charAt(left);
                freq[c - 'a']--;
                left++;
            }
            maxLength = Math.max(maxLength , right - left + 1);
        }
        return maxLength;
    }
}