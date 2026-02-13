class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max = 0;
        int res = 0;
        int[] h = new int[26];
        int i = 0;
        for (int j = 0; j < answerKey.length(); j++) {
            h[answerKey.charAt(j) - 'A']++;
            max = Math.max(max, h[answerKey.charAt(j) - 'A']);
            while (j - i + 1 > k + max) {
                h[answerKey.charAt(i) - 'A']--;
                i++;
            }
            res = Math.max(max, j - i + 1);
        }
        return res;
    }
}