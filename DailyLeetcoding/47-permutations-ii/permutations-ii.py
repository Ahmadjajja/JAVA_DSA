# class Solution:
#     def permuteUnique(self, nums: List[int]) -> List[List[int]]:
#         res = []
#         perm = []
#         count = { n:0 for n in nums }

#         # count each element in nums array
#         for n in nums:
#             count[n] += 1

#         def dfs():
#             # base case
#             if len(nums) == len(perm):
#                 res.append(perm.copy())
#                 return
            
#             for n in count:
#                 if count[n] > 0:
#                     perm.append(n)
#                     count[n] -= 1

#                     dfs()

#                     count[n] += 1
#                     perm.pop()
#         dfs()
#         return res





class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:

        res = []
        perm = []
        count = { n: 0  for n in nums }

        for num in nums:
            count[num] = count[num] + 1;
        
        def dfs():
            # base condition

            if len(nums) == len(perm):
                res.append(perm.copy())
                return
            
            for n in count:
                if count[n] > 0:
                    perm.append(n) 
                    count[n] = count[n] - 1

                    dfs()

                    # backtrack
                    perm.pop()
                    count[n] = count[n] + 1

        dfs()

        return res
















