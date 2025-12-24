class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int[] h=new int[51];
        int res=0,sum=0;
        for(int i=0;i<apple.length;i++) sum+=apple[i];
        for(int i=0;i<capacity.length;i++) h[capacity[i]]++;
        for(int i=50;i>0;i--){
            while(h[i]>0){
                sum=sum-i;
                h[i]--;
                res++;
                if(sum <= 0) return res;
            }
        }
        return res;
    }
}