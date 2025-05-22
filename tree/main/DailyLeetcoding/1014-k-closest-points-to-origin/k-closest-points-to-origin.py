class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        minHeap = []
        
        for point in points:
            dis = point[0]**2 + point[1]**2

            heapq.heappush(minHeap, (dis, tuple(point)))

        res = []

        for i in range(k):
            minDis = heapq.heappop(minHeap)[1]
            res.append(minDis)


        return res

        





        