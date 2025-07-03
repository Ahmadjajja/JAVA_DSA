class Solution:
    def isHappy(self, n: int) -> bool:
        checkDuplicate = set()


        while n != 1:
            print("n : ", n)

            if n in checkDuplicate:
                return False

            checkDuplicate.add(n)

            nextNum = 0
            num = n
            while num:

                nextNum += (num % 10) ** 2
                num = num // 10
            
            n = nextNum


        return True
        