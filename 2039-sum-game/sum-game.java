class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0 , rightSum = 0;
        int leftQ = 0 , rightQ = 0;
        int n = num.length();
        for(int i = 0 ; i < n / 2 ; i++){
            if(num.charAt(i) == '?') leftQ++;
            else leftSum += num.charAt(i) - '0';
        }
        for(int i = n / 2 ; i < n ; i++){
            if(num.charAt(i) == '?') rightQ++;
            else rightSum += num.charAt(i) - '0';
        }
        return (2 * leftSum + 9 * leftQ) != (2 * rightSum + 9 * rightQ);
    }
}