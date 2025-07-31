# Last updated: 31/07/2025, 21:06:44
class Solution:
    def isGood(self, nums: List[int]) -> bool:
        c=nums.count(max(nums))
        if c>1  and c<=2 and len(nums)==max(nums)+1:
            nums.sort()
            nums.remove(nums[-1])
            nums.remove(nums[-1])
            for i in nums:
                if nums.count(i)>=c:
                    return False
            return True
        return False    


        