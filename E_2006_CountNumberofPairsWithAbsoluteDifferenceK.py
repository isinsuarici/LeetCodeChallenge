class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        i=0
        j=0
        output=0
        while i<len(nums):
            j=i+1
            while j<len(nums):
                if abs(nums[i]-nums[j])==k:
                    output+=1
                j+=1
            i+=1
        return output