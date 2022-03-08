class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        nums.sort()
        if(nums[0]>1 or nums[n-1]<0):
            return 1
        for i in range(n-1):
            if (nums[i+1]>1) and (nums[i]<0):
                return 1
            if nums[i+1]-abs(nums[i])>1:
                return nums[i]+1
        return nums[n-1]+1
                