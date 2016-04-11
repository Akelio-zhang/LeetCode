class Solution(object):
        # @param {integer} num
        # @return {integer}
	def addDigits(self, num):
		temp = num
		while(self.isover(temp)):
			temp = self.addnum(temp)
		return temp
		
	def isover(self, num):
		if(num >= 10):
			return True
		else:
			return False
			
	def addnum(self, num):
		temp = num
		sum = 0
		while(self.isover(temp)):
			sum = sum + temp % 10
			temp = temp // 10
		sum = sum + temp
		return sum

a = Solution()
print(a.addDigits(38))
