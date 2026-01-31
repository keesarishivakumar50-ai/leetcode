class Solution {
    public void nextPermutation(int[] nums) {
        int index1 = -1 , index2 = -1;
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            if(nums[i] < nums[i + 1]){
                index1 = i; break;
            }
        }

        if(index1 == -1){
            int i = 0 , j = nums.length - 1;
            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;j--;
            }
        }
        else{
            for(int i = nums.length - 1 ; i >= 0 ; i--){
                if(nums[i] > nums[index1]){
                    index2 = i;
                    break;
                }
            }
            int t = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = t;
            int i = index1 + 1 , j = nums.length - 1;
            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;j--;

            }
        }
    }
}