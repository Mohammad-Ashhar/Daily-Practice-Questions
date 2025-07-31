# Last updated: 31/07/2025, 21:05:49
class Solution:
    def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
        md=0
        mp=0
        ma=0
        for i,j in dimensions:
            d=i*i+j*j
            p=i+j
            a=i*j
            if d>md:
                md=d
                mp=p
                ma=a
            elif d==md:
                if p>mp:
                    mp=p
                    ma=a
        return ma                               

