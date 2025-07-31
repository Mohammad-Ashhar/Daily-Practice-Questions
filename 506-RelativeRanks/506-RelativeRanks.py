# Last updated: 31/07/2025, 21:16:00
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
            score2 = sorted(score, reverse=True)
            dic={}
            for i,v in enumerate(score2):
                if i==0:
                    dic[v]="Gold Medal"
                elif i==1:
                    dic[v]="Silver Medal"
                elif i==2:
                    dic[v]="Bronze Medal"
                else:
                    dic[v]=str(i+1)            
            result=[dic[s] for s in score]
            return result    
            
