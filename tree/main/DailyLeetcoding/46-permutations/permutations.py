class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:

        res = []

        def DFS(per, seen):

            # base case
            if len(per) == len(nums):

                res.append(per.copy())

                return

            for i in range(len(nums)):
                if nums[i] in per:
                    continue

                per.append(nums[i])

                DFS(per, seen)

                per.pop()
        
        DFS([], set())

        return res
        