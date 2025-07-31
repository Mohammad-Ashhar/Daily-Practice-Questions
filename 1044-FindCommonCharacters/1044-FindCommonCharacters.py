# Last updated: 31/07/2025, 21:14:11
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        if len(words)==1:
            return words[0]
        res=[]
        char=[]
        for i in words[0]:
            if i not in char:
                char.append(i)
        for ch in char:
            f=min([word.count(ch) for word in words])
            res+=f*[ch]
        return res                
        