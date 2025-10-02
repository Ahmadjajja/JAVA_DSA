class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) == 1:
            return 0
        
        left, right = 0, 1
        maxPro = 0

        while right < len(prices):
            if prices[left] >= prices[right]:
                left = right
                right = right + 1
            else:
                profit = prices[right] - prices[left]
                maxPro = max(profit, maxPro)
                right += 1

        return maxPro


        