
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        maxWater = 0

        while left < right:
            w = right - left
            h = min(height[left], height[right])
            water = w * h

            maxWater = max(water, maxWater)

            if height[left] >= height[right]:
                right -= 1
            else:
                left += 1
        
        return maxWater



