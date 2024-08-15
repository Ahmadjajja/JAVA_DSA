class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1
        profit = 0

        while r < len(prices):
            if prices[r] - prices[l] > 0:
                profit = max(profit, prices[r] - prices[l])
                r += 1
            else:
                l = r
                r += 1
        return profit