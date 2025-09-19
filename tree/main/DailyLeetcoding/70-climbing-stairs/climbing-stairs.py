class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        first, second = 1, 2

        for i in range(2, n):
            temp = first
            first = second
            second = temp + second

        return second
        