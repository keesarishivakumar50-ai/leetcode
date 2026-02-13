class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int ans=0;

        int run = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) run++;
            else { ans = Math.max(ans, run); run = 1; }
        }
        ans=Math.max(ans,run);

        ans = Math.max(ans, twoChar(s, 'a', 'b', 'c'));
        ans = Math.max(ans, twoChar(s, 'a', 'c', 'b'));
        ans = Math.max(ans, twoChar(s, 'b', 'c', 'a'));
        
        Map<String, Integer> map = new HashMap<>();
        map.put("0#0", -1);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else c++;
            String key = (a - b) + "#" + (a - c);
            if (map.containsKey(key)) ans = Math.max(ans, i - map.get(key));
            else map.put(key, i);
        }
        return ans;
    }

    private int twoChar(String s, char x, char y, char z) {
        int n = s.length(), best = 0, i = 0;
        while (i < n) {
            while (i < n && s.charAt(i) == z) i++;
            int j = i;
            while (j < n && s.charAt(j) != z) j++;
            Map<Integer, Integer> diff = new HashMap<>();
            diff.put(0, i - 1);
            int d = 0;
            for (int k = i; k < j; k++) {
                char ch = s.charAt(k);
                if (ch == x) d++;
                else if (ch == y) d--;
                best = Math.max(best, k - diff.getOrDefault(d, k));
                diff.putIfAbsent(d, k);
            }
            i = j;
        }
        return best;
    }
}