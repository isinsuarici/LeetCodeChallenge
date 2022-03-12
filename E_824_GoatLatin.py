class Solution:
    def toGoatLatin(self, sentence: str) -> str:
        tokens=sentence.split()
        
        for token in tokens:
            if token[0] in 'AEIOUaeiou':
                tokens[tokens.index(token)]=token+"ma"+(tokens.index(token)+1)*"a"
                
            else:
                tokens[tokens.index(token)]=token[1:]+token[0]+"ma"+(tokens.index(token)+1)*"a"
        
        return ' '.join(tokens)
     