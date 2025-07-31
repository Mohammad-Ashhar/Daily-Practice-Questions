# Last updated: 31/07/2025, 21:11:11
class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        final=[]
        for i in range(len(code)):
            if k>0:
                helper=0
                j=i+1
                m=k
                while m:
                    helper=helper+code[j%len(code)]
                    m=m-1
                    j=j+1
                final.append(helper)
            elif k==0:
                final.append(0)
            else:
                helper=0
                j=i-1
                m=k
                while m:
                    helper=helper+code[j%len(code)]
                    m=m+1
                    j=j-1        
                final.append(helper)
        return final