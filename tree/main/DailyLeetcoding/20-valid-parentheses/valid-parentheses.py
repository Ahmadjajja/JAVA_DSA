class Solution:
    def isValid(self, s: str) -> bool:
        p = {
            ")": "(",
            "}": "{",
            "]": "["
        }

        stack = []

        for ch in s:
            if ch in p:
                if stack and stack[-1] == p[ch]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(ch)

        return not stack
        