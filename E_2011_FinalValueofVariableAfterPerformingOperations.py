class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        X=0
        for op in operations:
            if op[1]=="-":
                X=X-1
            else:
                X=X+1
        return X
        