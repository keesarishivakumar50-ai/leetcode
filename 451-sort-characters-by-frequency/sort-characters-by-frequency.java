class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch , freq.getOrDefault(ch , 0) + 1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>((a , b) -> freq.get(b) - freq.get(a));
        queue.addAll(freq.keySet());
        StringBuilder res = new StringBuilder();
        while(!queue.isEmpty()){
            char ch = queue.poll();
            int c = freq.get(ch);
            for(int i = 0 ; i < c ; i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}