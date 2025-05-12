from typing import List

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        minPro = 1
        maxPro = 1

        for n in nums:
            if n == 0:
                minPro, maxPro = 1, 1
            tmp = maxPro * n
            maxPro = max(tmp, minPro * n, n)
            minPro = min(tmp, minPro * n, n)

            res = max(res, maxPro)
        
        return res
