class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.minHeap, self.k = nums, k

        heapq.heapify(self.minHeap);


    def add(self, val: int) -> int:
        heapq.heappush(self.minHeap, val);

        while len(self.minHeap) > self.k:
            heapq.heappop(self.minHeap)

        return self.minHeap[0];



# There are two things on leetcode
# 1 - understand the problem statement, then try to think & write on paper 
#     how the answers looks like by comparing with the question

# 2 - if you know all data structure & the answer will be clicked in
#     your mind at the same time


