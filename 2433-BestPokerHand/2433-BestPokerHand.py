# Last updated: 31/07/2025, 21:08:39
class Solution:
    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        if suits.count(suits[0])==5:
            return "Flush"
        dic={}
        for val in ranks:
            if val in dic:
                dic[val]+=1
            else:
                dic[val]=1
        m=max(dic.values())
        if m==1:
            return "High Card"
        elif m==2:
            return "Pair"
        elif m>=3:
            return "Three of a Kind"                    


        