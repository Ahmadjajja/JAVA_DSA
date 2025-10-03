class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        memo = {}

        def dfs(curAmount):
            if curAmount == 0:
                return 0
            
            if curAmount < 0:
                return float('inf')
            
            if curAmount in memo:
                return memo[curAmount]

            minCoins = float('inf')
            for coin in coins:
                minCoins = min(minCoins, dfs(curAmount - coin))
            
            memo[curAmount] = 1 + minCoins
            
            return 1 + minCoins


        ans = dfs(amount)

        return -1 if ans == float('inf') else ans
        

        