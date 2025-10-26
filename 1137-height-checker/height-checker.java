class Solution {
    public int heightChecker(int[] heights) {
        int res=0;
        int[] fre=new int[101];
        for(int height:heights) fre[height]++;
        int curHeight=0;
        for(int i=0;i<heights.length;i++){
            while(fre[curHeight]==0) curHeight++;

            if(curHeight!=heights[i]) res++;
            fre[curHeight]--;
        }
        return res;
    }
}