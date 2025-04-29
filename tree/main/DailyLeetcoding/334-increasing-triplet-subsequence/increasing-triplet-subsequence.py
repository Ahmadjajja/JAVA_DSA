class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        firstMin = float("inf")
        secondMin= float("inf")
        for n in nums:
            if n <= firstMin:
                firstMin = n
            elif n <= secondMin:
                secondMin = n
            else:
                return True
        return False
        