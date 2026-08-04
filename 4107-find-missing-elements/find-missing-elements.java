class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i : nums){
            min = Math.min(min , i);
            max = Math.max(max , i);
        }
        boolean[] h = new boolean[max + 1];
        for(int i : nums){
            h[i] = true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = min ; i <= max ; i++){
            if(!h[i]){
                list.add(i);
            }
        }
        return list;
    }
}