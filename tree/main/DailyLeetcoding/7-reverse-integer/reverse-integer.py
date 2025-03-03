class Solution:
    def reverse(self, x: int) -> int:
        # Handle negative numbers
        positive = True
        if x < 0:
            positive = False
            x = -x  # Convert to positive for processing
        
        rev = 0
        while x > 0:
            rev = rev * 10 + x % 10  # Append last digit
            x //= 10  # Integer division
        
        # Restore sign
        if not positive:
            rev = -rev
        
        # 32-bit integer overflow check
        if rev < (-2**31) or rev > (2**31 - 1):
            return 0
        
        return rev
