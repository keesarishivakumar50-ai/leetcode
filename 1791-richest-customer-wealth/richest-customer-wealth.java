class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0;
        for(int[] cus:accounts){
            int wealth=0;
            for(int bank:cus){
                wealth+=bank;
            }
            m=Math.max(m,wealth);
        }
        return m;
    }
}