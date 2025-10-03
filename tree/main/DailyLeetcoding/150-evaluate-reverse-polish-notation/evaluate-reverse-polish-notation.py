class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operators = ['+', '-', '*', '/']

        stack = []

        for token in tokens:

            if token in operators:
                num1 =stack.pop()
                num2 = stack.pop()

                if token == "+":
                    stack.append(num2 + num1)
                elif token == "-":
                    stack.append(num2 - num1)
                elif token == "*":
                    stack.append(num2 * num1)                
                elif token == "/":
                    stack.append(int(num2 / num1))
            else:
                stack.append(int(token))
        
        return stack.pop()
            


        