class Solution:
	# @param tokens, a list of string
	# @return an integer
	def evalRPN(self, tokens):
		stack = []
		for token in tokens:
			if token == '+':
				right = stack.pop()      
				left = stack.pop()
				stack.append(left + right)
			elif token == '-':
				right = stack.pop()
				left = stack.pop()
				stack.append(left - right)
			elif token == '*':
				right = stack.pop()
				left = stack.pop()
				stack.append(left * right)
			elif token == '/':
				right = stack.pop()
				left = stack.pop()
				stack.append(left / right)
			else:
				val = int(token)
				stack.append(val)

			s = " ".join([str(i) for i in stack])
			print(s)

		return stack.pop()

if __name__ == '__main__':
	s = Solution()
	tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
	print(s.evalRPN(tokens))
