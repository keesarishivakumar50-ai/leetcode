class Solution {
    public int maximumProduct(int[] nums) {
        int x=Integer.MIN_VALUE,y=Integer.MIN_VALUE,z=Integer.MIN_VALUE;
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        for(int n:nums){
            if(n>x){
                z=y;
                y=x;
                x=n;
            }
            else if(n>y){
                z=y;
                y=n;
            }
            else if(n>z){
                z=n;
            }
            if(n<a){
                b=a;
                a=n;
            }
            else if(n<b){
                b=n;
            }
        }
        return Math.max(x*y*z,a*b*x);
    }
}