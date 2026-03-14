class Solution {
    public int numFriendRequests(int[] ages) {
        int count = 0;
        Arrays.sort(ages);
        for(int i = ages.length - 1 ; i > 0 ; i--){
            for(int j = i - 1 ; j >= 0 ; j--){
                if(ages[j] <= 0.5 * ages[i] + 7) break;
                if(ages[i] == ages[j]) count+=2;
                else count++;
            }
        }
        return count;
    }
}