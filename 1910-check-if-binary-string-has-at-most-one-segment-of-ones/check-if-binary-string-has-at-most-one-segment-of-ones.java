class Solution {
    public boolean checkOnesSegment(String s) {
        char[] arr = s.toCharArray();
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == '1' && arr[i - 1] == '0') return false;
        }
        return true;
    }
}