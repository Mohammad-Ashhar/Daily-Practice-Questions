# Last updated: 31/07/2025, 21:10:39
class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        if ruleKey=="type":
            a=0
        elif ruleKey=="color":
            a=1
        elif ruleKey=="name":
            a=2
        c=0
        for i in items:
            if i[a]==ruleValue:
                c+=1
        return c            

        