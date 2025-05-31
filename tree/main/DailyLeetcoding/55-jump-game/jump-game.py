class Solution:
    def canJump(self, nums: List[int]) -> bool:

        # ans = False

        # def DFS(index):

        #     nonlocal ans

        #     if index == len(nums) - 1:
        #         return True

        #     if index >= len(nums):
        #         return False


        #     for i in range(index, index + nums[index]):

        #         ans = ans or DFS(i + 1) 
            
        #     return ans


        # return DFS(0)
        maxReach = 0
        for i in range(len(nums)):
            if i > maxReach:
                return False
            maxReach = max(maxReach, i + nums[i])
        return True


        # goal = len(nums) - 1
        # for i in range(len(nums) - 2, -1, -1):
        #     if nums[i] >= (goal - i):
        #         goal = i
            
        # return goal == 0