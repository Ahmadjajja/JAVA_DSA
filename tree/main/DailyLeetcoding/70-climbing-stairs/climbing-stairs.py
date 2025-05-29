class Solution:
    def climbStairs(self, n: int) -> int:

        # memo = {}

        # def DFS(steps):

        #     if steps == n:
        #         return 1
            
        #     if steps > n:
        #         return 0
            
        #     if steps in memo:
        #         return memo[steps]
            
        #     leftAns = DFS(steps + 1)

        #     rightAns = DFS(steps + 2)

        #     memo[steps] = leftAns + rightAns

        #     return memo[steps]

        # return DFS(0)

        two, one = 1, 1
        n = n - 2

        while n > -1:
            temp = one
            one = one + two
            two = temp
            n -= 1
        
        return one

