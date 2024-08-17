class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""  # Edge case: if `t` is an empty string, return an empty string
        
        # Initialize dictionaries to store the frequency of characters in `t` and the current window in `s`
        countC, windowC = {}, {}

        # Count the frequency of each character in `t`
        for c in t:
            countC[c] = 1 + countC.get(c, 0)
        
        # `have` tracks how many characters are currently in the window with the correct frequency
        # `need` is the total number of unique characters needed (length of countC)
        have, need = 0, len(countC)
        
        # `res` will store the start and end indices of the minimum window
        # `resLen` will store the length of the minimum window
        res, resLen = [-1, -1], float('infinity')
        l = 0  # Left pointer for the sliding window

        # Iterate over the string `s` with the right pointer `r`
        for r in range(len(s)):
            ch = s[r]
            windowC[ch] = 1 + windowC.get(ch, 0)  # Update the count of the current character in the window

            # If the current character `ch` is in `t` and its count matches the required count
            if ch in countC and windowC[ch] == countC[ch]: 
                have += 1

            # Shrink the window from the left until it no longer contains all the required characters
            while have == need:
                # Update result if the current window is smaller than the previously found minimum window
                if (r - l + 1) < resLen:
                    res = [l, r]
                    resLen = r - l + 1

                # Remove the leftmost character from the window
                windowC[s[l]] -= 1

                # If the removed character is in `t` and its frequency in the window is now less than required
                if s[l] in countC and windowC[s[l]] < countC[s[l]]:
                    have -= 1

                l += 1  # Move the left pointer to the right

        l, r = res  # Extract the indices of the minimum window

        # Return the minimum window substring, or an empty string if no such window exists
        return s[l : r + 1] if resLen != float("infinity") else ""
