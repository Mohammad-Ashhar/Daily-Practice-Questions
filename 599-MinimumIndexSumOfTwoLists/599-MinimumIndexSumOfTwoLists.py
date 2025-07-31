# Last updated: 31/07/2025, 21:15:42
class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        dic={}
        for i in list1:
            if i in list2:
                dic[i]=list1.index(i)
        for i in list2:
            if i in list1:
                dic[i]=dic[i]+list2.index(i)
        dic=dict(sorted(dic.items()))
        m=min(dic.values())
        a=[]
        for key,value in dic.items():
            if value==m:
                a.append(key)
        return a               


        