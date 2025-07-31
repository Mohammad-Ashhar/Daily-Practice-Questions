# Last updated: 31/07/2025, 21:16:05
class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        a=[]
        for i in words:
            lower=i.lower()
            if all(j in "qwertyuiop" for j in lower) or all(j in "asdfghjkl" for j in lower) or all(j in "zxcvbnm" for j in lower):
                a.append(i)
        return a        

        