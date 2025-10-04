class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> r=new ArrayList<>();
        r.add(0);
        for(int i=0;i<n;i++){
            int size=r.size();
            for(int j=size-1;j>=0;j--){
                r.add(r.get(j)|(1<<i));
            }
        }
        return r;
    }
}