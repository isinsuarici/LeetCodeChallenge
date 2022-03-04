class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        ret=[]
        answer=[]
        for numara in list(range(len(boxes))):
            if boxes[numara] in '1':
                ret.append(numara)
            answer.append(0)
               
        for numara2 in list(range(len(boxes))):   
            for numara3 in list(range(len(ret))):
                answer[numara2]+= abs(ret[numara3]-numara2)
                
        return answer