class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        heap = nums.copy()

        heapq.heapify(heap)
    
        while len(heap) > k:
            heapq.heappop(heap)
        
        return heapq.heappop(heap)
        