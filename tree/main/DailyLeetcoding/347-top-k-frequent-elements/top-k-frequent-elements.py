class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums.sort()

        heap = []
        heapq.heapify(heap)

        count = 0
        for i in range(len(nums)):
            if i + 1 < len(nums) and nums[i] == nums[i + 1]:
                count += 1
            elif i + 1 == len(nums) or nums[i] != nums[i + 1]:
                heapq.heappush(heap, (count + 1, nums[i]))
                count = 0
                
        while len(heap) > k:
            heapq.heappop(heap)
        
        ans = []

        for freq, elem in heap:
            ans.append(elem)

        return ans
        