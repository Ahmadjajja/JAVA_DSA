class Solution:
    def lengthOfLastWord(self, s: str) -> int:

        index = len(s) - 1


        while index >= 0:
            if s[index] != " ":
                break

            index = index - 1
        
        count = 0


        while index >= 0:
            if s[index] != " ":
               count = count + 1
               index = index - 1
            else:
                break
        
        return count

            

            


