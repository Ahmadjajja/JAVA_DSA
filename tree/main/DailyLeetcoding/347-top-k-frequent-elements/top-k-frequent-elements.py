class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # store counts in hashmap
        counts = {}
        for n in nums:
            if n not in counts:
                counts[n] = 1
            else:
                counts[n] += 1
        

        # create a maxheap
        maxheap = []

        for key, value in counts.items():
            heapq.heappush(maxheap, (-value, key))
        # pop k elements and store in ans arr
        ans = []
        for i in range(k):
            ans.append(heapq.heappop(maxheap)[1])
        # return ans
        return ans
        