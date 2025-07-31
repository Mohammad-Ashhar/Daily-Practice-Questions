# Last updated: 31/07/2025, 21:10:53
class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        boxTypes.sort(key = lambda x:x[1], reverse = True)
        print(boxTypes)
        units = 0
        truck = 0
        for box in boxTypes:
            truck += box[0]
            if truck < truckSize:
                units += box[0] * box[1]
            else:
                units += (truckSize-(truck-box[0])) * box[1]
                break
        return units