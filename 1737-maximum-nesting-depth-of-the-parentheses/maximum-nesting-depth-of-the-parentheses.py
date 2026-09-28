class Solution:
    def maxDepth(self, s: str) -> int:
        max_Depth = 0
        count = 0
        for ch in s:
            if ch == '(':
                count = count + 1
                max_Depth = max(max_Depth , count)
            elif ch == ')':
                count = count - 1
        return max_Depth