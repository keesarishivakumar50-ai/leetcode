class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq=new int[value];
        for(int x:nums){
            int a=((x%value)+value)%value;
            freq[a]++;
        }
        int x=0;
        while(true){
            int r=x%value;
            if(freq[r]==0) return x;
            freq[r]--;
            x++;
        }
    }
}