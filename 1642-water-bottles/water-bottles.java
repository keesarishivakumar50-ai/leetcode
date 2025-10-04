class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int n=empty/numExchange;
            max+=n;
            empty=n+(empty%numExchange);
        }
        return max;
    }
}