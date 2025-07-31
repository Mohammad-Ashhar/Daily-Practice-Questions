# Last updated: 31/07/2025, 21:13:22
class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        dic={}
        for ele in arr:
            if ele in dic:
                dic[ele]+=1
            else:
                dic[ele]=1
        frequencies=list(dic.values())
        return len(frequencies)==len(set(frequencies))    

        