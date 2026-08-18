class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int x : nums){
            freq.put(x , freq.getOrDefault(x , 0) + 1);
        }
        int k = n / 3;
        for(Map.Entry<Integer , Integer> entry : freq.entrySet()){
            if(entry.getValue() > k) list.add(entry.getKey());
        }
        return list;
    }
}