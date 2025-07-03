class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1

        for i in range(len(digits) - 1, -1, -1):
            if carry == 0:
                break

            if digits[i] == 9:
                digits[i] = 0
            else:
                digits[i] += 1
                carry = 0
        
        return digits if carry == 0 else [1] + digits
        