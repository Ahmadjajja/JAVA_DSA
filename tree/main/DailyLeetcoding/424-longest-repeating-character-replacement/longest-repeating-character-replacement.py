class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        count, maxCount = 0, 0
        freq = [0] * 26

        l, r = 0, 0

        while r < len(s):
            # include s[r] first
            freq[ord(s[r]) - ord('A')] += 1

            # shrink while more than k replacements are needed
            while (r - l + 1) - max(freq) > k:
                freq[ord(s[l]) - ord('A')] -= 1
                l += 1

            # update window length and answer
            count = r - l + 1
            if count > maxCount:
                maxCount = count

            r += 1

        return maxCount
