class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [-1] * (n + 1)
        def waysFinder(num):
            if num == n:
                dp[num] = 1
                return 1
            if num > n:
                return 0

            if dp[num] != -1:
                return dp[num]

            ct1 = waysFinder(num + 1)
            ct2 = waysFinder(num + 2)

            dp[num] = ct1 + ct2
            return ct1 + ct2
        
        return waysFinder(0)
        

        