class Solution {
    public int minElement(int[] nums) {
        int max = 37;
        for(int x : nums){
            int dig = 0;
            while(x > 0){
                dig += (x % 10);
                x /= 10;
            }
            max = Math.min(dig , max);
        }
        return max;
    }
}