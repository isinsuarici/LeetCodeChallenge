class Solution:
    def findComplement(self, num: int) -> int:
        i=0
        j=0
        while(i<num):
            i+= 2**j
            j=j+1
        return i-num
    