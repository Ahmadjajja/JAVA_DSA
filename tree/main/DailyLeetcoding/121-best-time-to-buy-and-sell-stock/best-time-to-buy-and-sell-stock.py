class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left, right = 0, 1
        maxProfit = 0

        while right < len(prices):
            # calculating profit

            if prices[right] > prices[left]:
                maxProfit = max(maxProfit, prices[right] - prices[left])
            else:
                left = right
            
            right += 1

        return maxProfit

        
    # def maxProfit(self, prices: List[int]) -> int:
    #         l, r = 0,1
    #         maxP = 0
    #         while r < len(prices):
    #             if prices[r] > prices[l]:
    #                 maxP = max(prices[r] - prices[l],maxP)
    #             else:
    #                 l = r
    #             r+=1 
    #         return maxP
