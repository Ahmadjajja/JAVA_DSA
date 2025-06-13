class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        if len(tokens) == 1:
            return int(tokens[0])

        stack = []

        for token in tokens:
            if token != "+" and token != "-" and token != "/" and token != "*":
                stack.append(token)
            else:
                second = int(stack.pop())
                first = int(stack.pop())

                if token == "+":
                    stack.append(first + second)
                elif token == "-":
                    stack.append(first - second)
                elif token == "/":
                    stack.append(first / second)
                else :
                    stack.append(first * second)
                    
        return int(stack[0])     