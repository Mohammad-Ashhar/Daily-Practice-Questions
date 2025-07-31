# Last updated: 31/07/2025, 21:05:56
class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        r=[nums[0]]
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]+1:
                r.append(nums[i])
            else:
                break
        temp=sum(r)
        while temp in nums:
            temp+=1
        return temp                