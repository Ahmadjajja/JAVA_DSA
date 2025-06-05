class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0

        while n:
            count += (n % 2)
            n = n // 2
        
        return count
        