class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long res = 0;
        long pen = 0;
        while(pen <= total){
            long rem = total - pen;
            long pencil = (rem / cost2) + 1;
            res += pencil;
            pen += cost1;
        }
        return res;
    }
}