class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1Freq = [0] * 26
        s2windowFreq = [0] * 26

        l, r = 0, len(s1) - 1

        for i in range(r + 1):
            s1Freq[ord(s1[i]) - ord('a')] += 1
            s2windowFreq[ord(s2[i]) - ord('a')] += 1
        
        r += 1
        
        while r < len(s2):

            if s1Freq == s2windowFreq:
                return True
            
            s2windowFreq[ord(s2[l]) - ord('a')] -= 1
            s2windowFreq[ord(s2[r]) - ord('a')] += 1
            l += 1
            r += 1
        if s1Freq == s2windowFreq:
                return True
        
        return False



        