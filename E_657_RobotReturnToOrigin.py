class Solution:
    def judgeCircle(self, moves: str) -> bool:
        retVal=0
        for i in moves:
            if i=="U":
                retVal+=1
            if i=="D":
                retVal-=1
            if i=="R":
                retVal+=10000
            if i=="L":
                retVal-=10000
        if retVal==0:
            return True
        else:
            return False