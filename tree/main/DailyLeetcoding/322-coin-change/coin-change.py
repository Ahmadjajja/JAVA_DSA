class Solution:
#     def coinChange(self, coins: List[int], amount: int) -> int:
#         memo = {}

#         def helper(remainingAmount):

#             if remainingAmount in memo:
#                 return memo[remainingAmount]
#             if remainingAmount == 0:
#                 return 0
#             if remainingAmount < 0:
#                 return -1

#             minCoin = amount + 1
#             for i in range(len(coins)):
#                 res = helper(remainingAmount - coins[i])
#                 if res != -1:
#                     minCoin = min(minCoin, res + 1)

#             memo[remainingAmount] = minCoin if minCoin != amount + 1 else -1
#             return memo[remainingAmount]

#         return helper(amount)







    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [amount + 1] *  (amount + 1)

        dp[0] = 0
        
        for a in range(1, amount + 1):
            for c in coins:
                if a - c >= 0:
                    dp[a] = min(dp[a], 1 + dp[a - c])

        return dp[amount] if dp[amount] != amount + 1 else -1



        