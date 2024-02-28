import heapq
import math

class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        minHeap = []  # for extracting & adding min-val in O(1) time

        # storing points with their distance from origin in minHeap
        for point in points:
            distance = math.sqrt(point[0] ** 2 + point[1] ** 2)
            heapq.heappush(minHeap, (distance, point))
        
        ans = []

        # storing K Closest Points to Origin
        for _ in range(k):
            ans.append(heapq.heappop(minHeap)[1])

        return ans
