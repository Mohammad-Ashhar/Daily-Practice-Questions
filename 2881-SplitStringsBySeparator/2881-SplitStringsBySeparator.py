# Last updated: 31/07/2025, 21:06:47
class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        l=[]
        for i in words:
            swords=i.split(separator)
            l.extend(p for p in swords if p)                
        return l    

        