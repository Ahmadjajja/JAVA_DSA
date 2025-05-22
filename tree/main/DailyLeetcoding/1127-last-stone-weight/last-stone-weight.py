class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [-s for s in stones]

        minHeap = stones
        heapq.heapify(minHeap)

        while len(minHeap) > 1:
            y = abs(heapq.heappop(minHeap))
            x = abs(heapq.heappop(minHeap))

            
            heapq.heappush(minHeap, -(y - x))
            
        return abs(minHeap[0])

        