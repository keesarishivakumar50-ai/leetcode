class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> h = new HashSet<>();
        for(int num : friends){
            h.add(num);
        } 
        int[] res = new int[friends.length];
        int k = 0;
        for(int i = 0 ; i < order.length ; i++){
            if(h.contains(order[i])){
                res[k] = order[i];
                k++;
            }
        }
        return res;
    }
}