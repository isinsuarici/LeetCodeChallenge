class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        return len(set(arr[i]-arr[i-1] for i in range(1,len(arr)))) == 1