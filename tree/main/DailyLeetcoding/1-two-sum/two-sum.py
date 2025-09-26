class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # # brute-force(will try to optimize later)
        # for i in range(len(nums)):
        #     for j in range(len(nums)):
        #         if i == j:
        #             continue
        #         if nums[i] + nums[j] == target:
        #             return [i, j]
        
        # return [-1, -1]

        # # optimized approach
        # # 2. TC: O(nlogn + n + n) = O(nlogn), SC: O(n)
        # sortedNums = sorted(nums)
        # num1, num2 = 0,  0

        # s, e = 0, len(nums) - 1
        # while s <= e:

        #     if sortedNums[s] + sortedNums[e] > target:
        #         e -= 1
        #     elif sortedNums[s] + sortedNums[e] < target:
        #         s += 1
        #     else:
        #         num1 = sortedNums[s]
        #         num2 = sortedNums[e]
        #         break

        # ans = []
        # for i in range(len(nums)):
        #     if nums[i] == num1 or nums[i] == num2:
        #         ans.append(i)
        #     if len(ans) == 2:
        #         break
        
        # return ans

        # even better approach
        hm = {}

        for i in range(len(nums)):
            diff = target - nums[i]
            if nums[i] in hm:
                return [hm[nums[i]], i]
            hm[diff] = i


        