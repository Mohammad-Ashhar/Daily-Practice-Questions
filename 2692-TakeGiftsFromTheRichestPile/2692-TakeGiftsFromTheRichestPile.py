# Last updated: 31/07/2025, 21:07:30
class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        def fun(g,k):
        # g=[25,64,9,4,100]
            while k!=0:
                k=k-1
                m=max(g)
                i=g.index(m)
                g[i]=int(m**(1/2))
            return sum(g)
        return fun(gifts,k)