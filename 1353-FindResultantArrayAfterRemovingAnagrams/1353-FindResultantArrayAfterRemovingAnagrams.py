# Last updated: 31/07/2025, 21:13:14
class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        uw=[words[0]]
        for i in range(1,len(words)):
            if ''.join(sorted(words[i]))!=''.join(sorted(words[i-1])):
                uw.append(words[i])
        return uw           

                       

        