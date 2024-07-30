class Solution:
    def countBits(self, n: int) -> List[int]:
        ans = []
        def numberOfOnes(num):
            count = 0
            while num:
                count += num % 2 # checking if 1 is at the last or not
                num = num >> 1 # right shift operator to shift it on the right side
            return count

        for i in range(0, n + 1):
            ans.append(numberOfOnes(i))
        
        return ans
        