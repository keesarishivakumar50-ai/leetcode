class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        String prev="";
        for(String word:words){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sort=new String(arr);
            if(!sort.equals(prev)){
                res.add(word);
                prev=sort;
            }
        }
        return res;
    }
}