class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> great = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for(int num : nums){
            if(num > pivot){
                great.add(num);
            }
            else if(num < pivot){
                less.add(num);
            }
            else{
                equal.add(num);
            }
        }
        int[] res = new int[nums.length];
        int index = 0;
        for(int num : less) res[index++] = num;
        for(int num : equal) res[index++] = num;
        for(int num : great) res[index++] = num;
        return res;
        
    }

}