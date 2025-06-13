class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []

        def validP(st):
            stack = []

            for ch in st:
                if stack:
                    if ch == ")":
                        popedEle = stack.pop()
                        if ch != popedEle:
                            continue
                        else:
                            return False
                    stack.append(ch)
                else:
                    stack.append(ch)
            
            return False if stack else True

        def DFS(st, count):

            if count == n * 2:
                if validP(st):
                    ans.append(st)
                return
            
            DFS(st + "(", count + 1)
            DFS(st + ")", count + 1)

        
        DFS("", 0)

        return ans
        