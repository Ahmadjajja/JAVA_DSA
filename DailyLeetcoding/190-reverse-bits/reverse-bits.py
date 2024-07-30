class Solution:
    def reverseBits(self, n: int) -> int:
        count = 0
        listArr = []
        while n:
            listArr.append(n % 2)
            n = n >> 1
            count += 1

        for i in range(32 - count):
            listArr.append(0)

        print("listArr length:", len(listArr))
        print("listArr:", listArr)

        # Convert listArr to a string of bits, then parse as an integer
        reversed_num = int("".join(map(str, listArr)), 2)
        return reversed_num
