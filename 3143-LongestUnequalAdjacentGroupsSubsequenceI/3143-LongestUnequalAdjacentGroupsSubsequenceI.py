# Last updated: 31/07/2025, 21:06:31
class Solution:
    def getLongestSubsequence(self, words: List[str], groups: List[int]) -> List[str]:
        arr=[words[0]]
        n=len(groups)
        ind=1
        while ind<n:
            if groups[ind-1]!=groups[ind]:
                arr.append(words[ind])
            ind+=1
        return arr        
