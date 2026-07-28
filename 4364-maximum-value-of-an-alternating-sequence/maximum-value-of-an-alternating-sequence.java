class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1) return s;
        long peak = (n / 2) - 1;
        return (long) s + m + (m - 1) * peak;
    }
}