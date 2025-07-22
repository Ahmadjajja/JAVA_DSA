class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        uniqueSubSet = set()

        def backtrack(index, subSet):
            nonlocal uniqueSubSet

            if index == len(nums):
                uniqueSubSet.add(tuple(subSet))
                return 
            
            # ignore current element
            backtrack(index + 1, subSet)

            # pick current element
            subSet.append(nums[index])
            backtrack(index + 1, subSet)
            subSet.pop()

        backtrack(0, [])

        return [list(tup) for tup in uniqueSubSet]
        