class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> h = new HashSet<>();
        for(int num : friends){
            h.add(num);
        } 
        int[] res = new int[friends.length];
        int k = 0;
        for(int num : order){
            if(h.contains(num)){
                res[k] = num;
                k++;
            }
        }
        return res;
    }
}