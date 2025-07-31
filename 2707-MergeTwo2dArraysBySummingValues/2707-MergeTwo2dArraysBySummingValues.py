# Last updated: 31/07/2025, 21:07:27
class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        dic={item[0]:item[1] for item in nums1}
        for item in nums2:
            if item[0] in dic:
                dic[item[0]]+=item[1]
            else:
                dic[item[0]]=item[1]
        return sorted([[i,j] for i,j in dic.items()],key=lambda x:x[0])             

        