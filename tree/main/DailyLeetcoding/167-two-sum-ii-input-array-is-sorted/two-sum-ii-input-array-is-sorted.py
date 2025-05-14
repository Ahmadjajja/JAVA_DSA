class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left, right = 0, len(numbers) - 1

        while left < right:

            while numbers[left] + numbers[right] > target:
                right -= 1
            
            while numbers[left] + numbers[right] < target:
                left += 1
                
            if numbers[left] + numbers[right] == target:
                return [left + 1, right + 1]
        
        return []
        