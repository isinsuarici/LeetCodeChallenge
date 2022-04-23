class Solution:    
    def mergeSort(self,array):
        if len(array) > 1:
            r = len(array)//2
            L = array[:r]
            M = array[r:]
            self.mergeSort(L)
            self.mergeSort(M)
            i = j = k = 0
            while i < len(L) and j < len(M):
                if L[i] < M[j]:
                    array[k] = L[i]
                    i += 1
                else:
                    array[k] = M[j]
                    j += 1
                k += 1
            while i < len(L):
                array[k] = L[i]
                i += 1
                k += 1
            while j < len(M):
                array[k] = M[j]
                j += 1
                k += 1
        return array
        
    def sortedSquares(self, array: List[int]) -> List[int]:
        for el in range(0,len(array)):
            array[el]=array[el]**2
        array=self.mergeSort(array)
        return array
        
    
    

      
        