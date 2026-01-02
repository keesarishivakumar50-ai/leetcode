class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int num : nums){
            if(h.contains(num)) return num;
            h.add(num);
        }
        return -1;
    }
}