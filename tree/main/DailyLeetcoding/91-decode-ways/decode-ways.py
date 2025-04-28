class Solution:
    def numDecodings(self, s: str) -> int:
        memo = {}
        
        def helper(i):
            if i in memo:
                return memo[i]

            if i == len(s):
                return 1
            
            if s[i] == '0':  # '0' cannot be decoded
                return 0
            
            # Take 1 digit
            res = helper(i + 1)
            
            # Take 2 digits
            if i + 1 < len(s) and 10 <= int(s[i:i+2]) <= 26:
                res += helper(i + 2)

            memo[i] = res

            return res

        return helper(0)
