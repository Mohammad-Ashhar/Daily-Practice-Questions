# Last updated: 31/07/2025, 21:09:51
class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        dic={}
        for i in arr:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        a=[]
        for i in arr: 
            if dic[i]==1:
                a.append(i)
        if k>len(a):
            return ""
        else:
            return a[k-1]                                   

        