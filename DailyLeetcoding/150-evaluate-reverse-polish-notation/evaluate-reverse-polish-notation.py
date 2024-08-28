class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for token in tokens:
            if token in {"+", "-", "/", "*"}:
                a = int(stack.pop())
                b = int(stack.pop())
                
                if token == "+":
                    result = b + a
                elif token == "*":
                    result = b * a
                elif token == "/":
                    result = int(b / a)
                elif token == "-":
                    result = b - a
                
                stack.append(result)
            else:
                stack.append(int(token))
        
        return stack[0]