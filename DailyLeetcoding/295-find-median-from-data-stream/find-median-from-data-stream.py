import heapq

class MedianFinder:

    def __init__(self):
        self.minHeap = []  # stores the larger half of the numbers
        self.maxHeap = []  # stores the smaller half of the numbers

    def addNum(self, num: int) -> None:
        # Push the negative of the number to maxHeap
        # to simulate a max heap behavior
        heapq.heappush(self.maxHeap, -num)
        
        # Balance the heaps if necessary
        heapq.heappush(self.minHeap, -heapq.heappop(self.maxHeap))
        if len(self.minHeap) > len(self.maxHeap):
            heapq.heappush(self.maxHeap, -heapq.heappop(self.minHeap))

    def findMedian(self) -> float:
        if len(self.minHeap) == len(self.maxHeap):
            return (self.minHeap[0] - self.maxHeap[0]) / 2
        else:
            return -self.maxHeap[0]
