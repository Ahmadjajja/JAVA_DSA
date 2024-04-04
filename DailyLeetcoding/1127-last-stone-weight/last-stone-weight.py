from typing import List
import heapq

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        # Negate all values to create a max heap
        maxHeap = [-stone for stone in stones]
        heapq.heapify(maxHeap)  # Convert the list to a heap in-place

        # While there are more than 1 stone remaining
        while len(maxHeap) > 1:
            val1 = -heapq.heappop(maxHeap)  # Pop the largest stone
            val2 = -heapq.heappop(maxHeap)  # Pop the second largest stone

            if val1 != val2:
                remainElem = val1 - val2
                heapq.heappush(maxHeap, -remainElem)  # Push the remaining stone back into maxHeap

        return -maxHeap[0] if len(maxHeap) == 1 else 0



# sort the array
1, 2, 3, 4, 5












