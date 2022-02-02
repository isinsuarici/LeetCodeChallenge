class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        def binary_search(row):
            start, end = 0, len(row)
            while start<end:
                mid = start + (end-start)//2 #floor divison
                if row[mid]<0:
                    end = mid
                else:
                    start = mid+1
            return len(row)- start
        
        count = 0
        for row in grid:
            count += binary_search(row)
        return(count)
        