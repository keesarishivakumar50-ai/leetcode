class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
    private void reverse(int[] arr,int a,int b){
        while(a<b){
            int t=arr[a];
            arr[a]=arr[b];
            arr[b]=t;
            a++;
            b--;
        }
    }
}