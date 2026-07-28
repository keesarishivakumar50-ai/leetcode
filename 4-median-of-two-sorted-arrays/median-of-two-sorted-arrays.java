class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1 , 0 , merged , 0 , nums1.length);
        System.arraycopy(nums2 , 0 , merged , nums1.length , nums2.length);

        Arrays.sort(merged);
        int len = merged.length;
        if(len % 2 == 0) return (merged[len / 2] + merged[len/2 - 1]) / 2.0;
        else return merged[len / 2];
    }
}