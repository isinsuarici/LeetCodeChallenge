class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        first=list(words[0])
        for word in words[1:]:
            other=[]
            for letter in word:
                if letter in first:
                    other.append(letter)
                    first.remove(letter)
            first=other
            
        return first
