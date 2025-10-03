class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operators = ['+', '-', '*', '/']
        stack = []

        for token in tokens:
            if token in operators:
                b = stack.pop()
                a = stack.pop()
                if token == '+':
                    stack.append(a + b)
                elif token == '-':
                    stack.append(a - b)
                elif token == '*':
                    stack.append(a * b)
                else:  # '/'
                    stack.append(int(a / b))  # truncates toward zero
            else:
                stack.append(int(token))

        return stack.pop()
