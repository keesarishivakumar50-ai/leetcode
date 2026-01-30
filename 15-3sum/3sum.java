class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int a = 0 ; a < nums.length - 1 ; a++){
            if(a != 0 && nums[a] == nums[a - 1]){
                continue;
            }
            int b = a + 1;
            int c = nums.length - 1;

            while(b < c){
                int sum = nums[a] + nums[b] + nums[c];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[a]);
                    list.add(nums[b]);
                    list.add(nums[c]);
                    ans.add(list);
                    b++;
                    c--;
                    while(b < c && nums[b] == nums[b - 1]){
                        b++;
                    }
                    while(b < c &&nums[c] == nums[c + 1]){
                        c--;
                    }
                }
                else if(sum < 0){
                    b++;
                }
                else if(sum > 0){
                    c--;
                }
            }
        }
        return ans;
    }
}