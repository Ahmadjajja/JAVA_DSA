class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        subset = []

        def dfs(index):
            print("subset ->" , subset)
            if index == len(nums):
                res.append(subset.copy())
                return 

            # include index value
            subset.append(nums[index])
            dfs(index + 1)

            # exclude index value
            subset.pop()
            dfs(index + 1)


        dfs(0)

        return res