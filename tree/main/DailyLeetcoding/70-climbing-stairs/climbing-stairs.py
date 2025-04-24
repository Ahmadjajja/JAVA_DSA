# class Solution:
#     def climbStairs(self, n: int) -> int:
#         def helper(stepCounter):
#             if stepCounter == n:
#                 return 1
#             if stepCounter > n:
#                 return 0
#             return helper(stepCounter + 1) + helper(stepCounter + 2)

#         return helper(0)

class Solution:
    def climbStairs(self, n: int) -> int:
        one, two = 1, 1

        for i in range(n - 1):
            temp = one
            one = one + two
            two = temp
        
        return one