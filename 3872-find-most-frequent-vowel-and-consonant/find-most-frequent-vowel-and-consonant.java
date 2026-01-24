class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int vowel = 0 , cons = 0;
        for(char ch : s.toCharArray()){
            int i = ch - 'a';
            freq[i]++;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel = Math.max(vowel , freq[i]);
            }
            else{
                cons = Math.max(cons , freq[i]);
            }
        }
        return vowel + cons;
    }
}