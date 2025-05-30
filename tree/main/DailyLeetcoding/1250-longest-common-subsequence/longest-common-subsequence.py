class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        DP = [[0 for j in range(len(text2) + 1)] for i in range(len(text1) + 1)]

        for i in range(len(text1) - 1, -1, -1):
            for j in range(len(text2) - 1, -1, -1):
                if text1[i] == text2[j]:
                    DP[i][j] = 1 + DP[i + 1][j + 1]
                else:
                    DP[i][j] =  max(DP[i][j + 1], DP[i + 1][j])
        
        return DP[0][0]





        # res = -1
        # subSeq = set()
        # def DFS1(index, st, text):
        #     nonlocal res, subSeq
        #     # base condition
        #     if index == len(text):
        #         subSeq.add(st)
        #         return
            
        #     DFS1(index + 1, st + "", text) # ignore current ch
        #     DFS1(index + 1, st + text[index], text) # chose currejt ch
            

        
        # DFS1(0, "", text1)

        # def DFS2(index, st, text):
        #     nonlocal res, subSeq
        #     # base condition
        #     if index == len(text):
        #         if st in subSeq:
        #             res = max(res, len(st))
        #         return
            
        #     DFS2(index + 1, st + "", text) # ignore current ch
        #     DFS2(index + 1, st + text[index], text) # chose currejt ch

        # DFS2(0, "", text2)

        # return res

        
        