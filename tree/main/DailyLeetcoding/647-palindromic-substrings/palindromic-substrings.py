class Solution:
    def countSubstrings(self, st: str) -> int:
        totalPalSubStr = 0

        for i in range(len(st)):
            # Odd length palindromes
            l, r = i, i
            while l >= 0 and r < len(st) and st[l] == st[r]:
                totalPalSubStr += 1
                l -= 1
                r += 1

            # Even length palindromes
            l, r = i, i + 1
            while l >= 0 and r < len(st) and st[l] == st[r]:
                totalPalSubStr += 1
                l -= 1
                r += 1

        return totalPalSubStr