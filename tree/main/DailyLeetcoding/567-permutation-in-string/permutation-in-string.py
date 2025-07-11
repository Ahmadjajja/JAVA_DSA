class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        alphFre = [0] * 26

        for ch in s1:
            index = 97 - ord(ch)
            alphFre[index] += 1
        
        l = 0
        r = len(s1)

        while r <= len(s2):
            subFre = [0] * 26
            subString = s2[l:r]

            for ch in subString:
                index = 97 - ord(ch)
                subFre[index] += 1
            
            if subFre == alphFre:
                return True
            
            l += 1
            r += 1
        
        return False


        