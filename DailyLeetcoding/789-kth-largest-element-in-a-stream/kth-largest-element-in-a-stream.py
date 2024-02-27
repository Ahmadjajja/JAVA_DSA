class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        # minHeap with K largest integers
        # creating member funtions of class
        self.minHeap, self.k = nums, k
        # converting array( minHeap ) to Min Heap that will create the sorted property
        heapq.heapify(self.minHeap)
        # It will run in O(n) times, but it could be have more than K elements
        while len(self.minHeap) > self.k:
            heapq.heappop(self.minHeap)

    def add(self, val: int) -> int:
        heapq.heappush(self.minHeap, val)
        if len(self.minHeap) > self.k:
            heapq.heappop(self.minHeap)
        return self.minHeap[0]

