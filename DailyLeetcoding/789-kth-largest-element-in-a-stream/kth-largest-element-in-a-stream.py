class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        # minHeap with K largest integers
        self.minHeap, self.k = nums, k
        heapq.heapify(self.minHeap)
        while len(self.minHeap) > k:
            heapq.heappop(self.minHeap)

    def add(self, val: int) -> int:
        heapq.heappush(self.minHeap, val)
        if len(self.minHeap) > self.k:
            heapq.heappop(self.minHeap)
        return self.minHeap[0]

        


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)



# import java.util.PriorityQueue;

# class KthLargest {
#     PriorityQueue<Integer> minHeap;
#     int k;

#     public KthLargest(int k, int[] nums) {
#         this.k = k;
#         minHeap = new PriorityQueue<>();
#         for (int num : nums) {
#             minHeap.offer(num);
#             if (minHeap.size() > k)
#                 minHeap.poll();
#         }
#     }

#     public int add(int val) {
#         minHeap.offer(val);
#         if (minHeap.size() > k)
#             minHeap.poll();
#         return minHeap.peek();
#     }
# }