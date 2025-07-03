class Solution:
    def isHappy(self, n: int) -> bool:
        checkDuplicate = set()


        while n != 1:

            if n in checkDuplicate:
                return False

            checkDuplicate.add(n)

            num = str(n)
            nextNum = 0
            for ch in num:
                nextNum += int(ch) * int(ch)
            
            n = nextNum


        return True
        