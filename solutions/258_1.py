class Solution:
    # @param {integer} num
    # @return {integer}
    def addDigits(self, num):
        return num % 9 or num and 9

a = Solution()
print(a.addDigits(38))
