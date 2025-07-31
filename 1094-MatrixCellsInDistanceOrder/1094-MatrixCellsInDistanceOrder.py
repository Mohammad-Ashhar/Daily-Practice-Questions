# Last updated: 31/07/2025, 21:13:58
class Solution:
    def allCellsDistOrder(self, rows: int, cols: int, rCenter: int, cCenter: int) -> List[List[int]]:
        coordinates=[[r,c] for r in range(rows) for c in range(cols)]
        def manhattan_distance(coord):
            r,c=coord
            return abs(r-rCenter)+abs(c-cCenter)
        coordinates.sort(key=manhattan_distance)
        return coordinates    