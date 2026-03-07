class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int i = 0;
        if(ruleKey.equals("type")) i = 0;
        else if(ruleKey.equals("color")) i = 1;
        else i = 2;
        for(List<String> list : items){
            String str = list.get(i);
            if(str.equals(ruleValue)) count++;
        }
        return count;
    }

}