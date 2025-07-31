# Last updated: 31/07/2025, 21:08:19
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        l=list(zip(names,heights))
        sl=sorted(l,key=lambda x:x[1] , reverse=True)
        sln=[x[0] for x in sl]
        return sln
        