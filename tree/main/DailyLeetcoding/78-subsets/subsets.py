class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []


        subset = []

        def DFS(index):

            # base case
            if index == len(nums):
                res.append(subset.copy())
                return
            
            # YES
            subset.append(nums[index])
            DFS(index + 1)

            # NO
            subset.pop()
            DFS(index + 1)

        DFS(0)
        
        return res
        