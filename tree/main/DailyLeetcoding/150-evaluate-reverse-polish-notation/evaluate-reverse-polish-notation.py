class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        if len(tokens) == 1:
            return int(tokens[0])

        stack = []

        for token in tokens:
            if token != "+" and token != "-" and token != "/" and token != "*":
                stack.append(token)
            else:
                second = stack.pop()
                first = stack.pop()

                if token == "+":
                    stack.append(int(first) + int(second))
                elif token == "-":
                    stack.append(int(first) - int(second))
                elif token == "/":
                    stack.append(int(first) / int(second))
                else :
                    stack.append(int(first) * int(second))
        return int(stack[0])     