# Last updated: 31/07/2025, 21:08:34
class Solution:
    def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
        merged_items = {}
        for item in items1:
            if item[0] in merged_items:
                merged_items[item[0]] += item[1]
            else:
                merged_items[item[0]] = item[1]
        for item in items2:
            if item[0] in merged_items:
                merged_items[item[0]] += item[1]
            else:
                merged_items[item[0]] = item[1]
        result = [[key, value] for key, value in merged_items.items()]
        result.sort()
        return result
        