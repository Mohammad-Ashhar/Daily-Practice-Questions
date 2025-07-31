# Last updated: 31/07/2025, 21:05:20
class Solution:
    def isValid(self, word: str) -> bool:
        word=word.lower()
        d=c=v=0
        if len(word)>=3:
            for I in word:
                if I.isdigit():
                    d+=1
                elif I in "aeiou":
                    v+=1
                elif I in "bcdfghjklmnpqrstvwxyz":
                    c+=1
            if c>=1 and v>=1 and c+v+d==len(word):
                return  True
            else:
                return False
        else:
            return False                                



        