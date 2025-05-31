class Solution:
    def canJump(self, nums: List[int]) -> bool:

        # def DFS(index):

        #     if index == len(nums) - 1:
        #         return True

        #     if index >= len(nums):
        #         return False

        #     ans = False

        #     for i in range(index, index + nums[index]):

        #         ans *= DFS(index + 1)
            
        #     return ans


        # return DFS(0)

        goal = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            if nums[i] >= (goal - i):
                goal = i
            
        return goal == 0