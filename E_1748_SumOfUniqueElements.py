class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        retVal=0
        count=Counter(nums)
        for (x,y) in count.items():
            if y==1:
                retVal+=x
        return retVal