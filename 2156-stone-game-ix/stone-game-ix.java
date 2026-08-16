class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] h = new int[3];
        for(int x : stones){
            h[x % 3]++;
        }
        if(h[0] % 2 == 0){
            return h[1] > 0 && h[2] > 0;
        }
        else return Math.abs(h[1] - h[2]) > 2;
    }
}