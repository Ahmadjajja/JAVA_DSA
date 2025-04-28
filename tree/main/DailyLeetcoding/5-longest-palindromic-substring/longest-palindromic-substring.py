class Solution:
    def longestPalindrome(self, st: str) -> str:
        # babad

        # let's write starting and ending indices of longest palindrome
        lPSt = ""
        # store len of lon... palind...
        pLen = 0

        for i in range(len(st)):
            # for odd length of p
            l, r = i, i

            while l >= 0 and r < len(st) and st[l] == st[r]:
                if (r - l + 1) > pLen:
                    lPSt = st[l:r + 1]
                    pLen = r - l + 1
                l -= 1
                r += 1
            print(st[l:r])
            # for even length of p
            l, r = i, i + 1

            while l >= 0 and r < len(st) and st[l] == st[r]:
                if (r - l + 1) > pLen:
                    lPSt = st[l:r + 1]
                    pLen = r - l + 1
                l -= 1
                r += 1


        return lPSt



