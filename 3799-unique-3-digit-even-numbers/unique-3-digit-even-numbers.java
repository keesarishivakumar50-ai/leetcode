class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int num : digits){
            freq[num]++;
        }
        int res = 0;
        for(int i = 100 ; i < 1000 ; i+= 2){
            int hund = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;
            
            freq[hund]--;
            freq[tens]--;
            freq[ones]--;

            if(freq[hund] >= 0 && freq[tens] >= 0 && freq[ones] >= 0) res++;

            freq[hund]++;
            freq[tens]++;
            freq[ones]++;
        }
        return res;
    }
}