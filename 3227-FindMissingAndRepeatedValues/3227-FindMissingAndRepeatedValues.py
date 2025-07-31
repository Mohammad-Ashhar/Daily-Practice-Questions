# Last updated: 31/07/2025, 21:06:08
class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        newgrid=[item for j in grid for item in j ] 
        newgrid.sort()
        for i in newgrid:
            if newgrid.count(i)==2:
                c=i
                break
        s=list(set(newgrid))
        s.append(0)
        ind=1
        k=0
        while True:
            if ind==s[k]:
                k+=1
                ind+=1
            else:
                break         
        n=[]
        n.append(c)
        n.append(ind)
        return n            
