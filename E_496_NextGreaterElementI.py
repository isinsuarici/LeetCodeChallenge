class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        def find(num):
            for x in nums2[nums2.index(num):]:
                if x>num:
                    return x
            return -1
            
        return list(map(find,nums1))