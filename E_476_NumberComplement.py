class Solution:
    def findComplement(self, num):
        i=1
        while i<=num:
            i=i*2
        return (i-1)^num