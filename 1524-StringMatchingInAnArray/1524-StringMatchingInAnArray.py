# Last updated: 31/07/2025, 21:12:23
class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        words.sort(key=len)
        a=[]
        for i in range(len(words)):
            for j in range(i+1,len(words)):
                if words[i] in words[j]:
                    a.append(words[i])
        return list(set(a))            

        
        