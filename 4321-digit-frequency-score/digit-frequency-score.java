class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        while(n > 0){
            int x = n % 10;
            freq[x]++;
            n = n / 10;
        }
        int sum = 0;
        for(int i = 0 ; i < 10 ; i++){
            sum = sum + (i * freq[i]);
        }
        return sum;
    }
}