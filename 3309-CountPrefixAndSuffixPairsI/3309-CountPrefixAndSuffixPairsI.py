# Last updated: 31/07/2025, 21:05:41
class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        c=0
        for i in range(len(words)-1):
            for j in range(i+1,len(words)):
                l1=len(words[i])
                l2=len(words[j])
                if l1<=l2:
                    if words[i]==words[j][0:l1] and words[i]==words[j][l2-l1:]:
                        c+=1
        return c                
        