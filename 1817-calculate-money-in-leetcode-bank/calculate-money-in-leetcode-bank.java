class Solution {
    public int totalMoney(int n) {
        int weeks=n/7;
        int days=n%7;
        int sum=week(weeks)+day(weeks,days);
        return sum;
    }
    private int week(int x){
        int sum=0;
        for(int i=0;i<x;i++){
            sum+=28+(i*7);
        }
        return sum;
    }
    private int day(int x,int n){
        int sum=0,i=1;
        while(n!=0){
            sum+=(x+i);
            i++;
            n--;
        }
        return sum;
    }
}