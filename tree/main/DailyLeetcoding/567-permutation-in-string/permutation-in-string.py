class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
            
        alphFre = [0] * 26
        subFre = [0] * 26

        for i in range(len(s1)):
            index1 = ord(s1[i]) - 97 
            index2 = ord(s2[i]) - 97 
            alphFre[index1] += 1
            subFre[index2] += 1

        
        l = 0
        r = len(s1) 

        while r <= len(s2):
            # print("alphFre : ", alphFre)
            # print("subFre : ", subFre)
            # print("subStr : ", s2)
            if subFre == alphFre:
                return True
            if r < len(s2):
                indexRight = ord(s2[r]) - 97 
                indexLeft = ord(s2[l]) - 97
            
                subFre[indexRight] += 1
                subFre[indexLeft] -= 1
            
            l += 1
            r += 1
        
        return False


        