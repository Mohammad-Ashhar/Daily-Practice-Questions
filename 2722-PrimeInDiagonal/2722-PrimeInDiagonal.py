# Last updated: 31/07/2025, 21:07:14
class Solution:
    def diagonalPrime(self, nums: List[List[int]]) -> int:
        def prime(n):
            for i in range(2,int(n**.5)+1):
                if n%i==0:
                    return False
            if n==2:
                return True
            return True
        a=[]                    
        for i in range(len(nums)):
            if nums[i][i]==1:
                continue
            if prime(nums[i][i]):
                a.append(nums[i][i])        
            if prime(nums[i][len(nums)-i-1]):
                a.append(nums[i][len(nums)-i-1])
        if not a:
            return 0
        else:
            return max(a)                        

        