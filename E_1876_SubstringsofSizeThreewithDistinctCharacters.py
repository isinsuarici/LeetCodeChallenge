class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        counter=0
        for i in range(len(s)-2):
            if len(s[i:i+3]) == len(set(s[i:i+3])):
                counter = counter+1
                
        return counter