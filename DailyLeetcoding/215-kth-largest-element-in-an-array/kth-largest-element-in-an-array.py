class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        minHeap = []
        heapq.heapify(minHeap)  # Convert the list to a heap in-place

        for n in nums:
            heapq.heappush(minHeap, n);

            if len(minHeap) > k:
                heapq.heappop(minHeap);
            
        
        return heapq.heappop(minHeap)
