class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0) return new int[code.length];
        int n = code.length;
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            if(k > 0){
                for(int j = 1 ; j <= k ; j++){
                    sum += code[(j + i) % n];
                }
            }
            else{
                for(int j = 1 ; j <= Math.abs(k) ; j++){
                    sum += code[(i - j + n) % n];
                }
            }
            res[i] = sum;
        }
        return res;
    }
}