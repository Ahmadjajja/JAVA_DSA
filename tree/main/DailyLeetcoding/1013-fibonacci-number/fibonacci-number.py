class Solution:
    def fib(self, n: int) -> int:
        if n == 0:  # Special case when n = 0
            return 0
        if n == 1:  # Special case when n = 0
            return 1

        dp = [-1] * (n + 1)

        def fb(num):
            if num <= 1:
                return num
            if dp[num] != -1:
                return dp[num]
            
            dp[num] = fb(num - 1) + fb(num - 2)
            return dp[num]
        
        return fb(n)