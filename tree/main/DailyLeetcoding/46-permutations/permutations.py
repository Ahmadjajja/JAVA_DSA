class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:

        res = []

        def DFS(per, seen):

            # base case
            if len(per) == len(nums):
                res.append(per.copy())
                return

            for i in range(len(nums)):
                if i in seen:
                    continue
                
                seen.add(i)
                per.append(nums[i])

                DFS(per, seen)

                seen.remove(i)
                per.pop()

        DFS([], set())

        return res
        