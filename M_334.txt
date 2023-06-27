class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        min, secMin = sys.maxsize, sys.maxsize
        for num in nums:
            if num <= min:
                min = num
            elif num <= secMin:
                secMin = num
            else:
                return True
        return False