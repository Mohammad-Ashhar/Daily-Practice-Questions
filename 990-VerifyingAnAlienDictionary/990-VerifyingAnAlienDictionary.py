# Last updated: 31/07/2025, 21:14:21
class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        order_map = {char: index for index, char in enumerate(order)}

        positions = []
        for word in words:
            word_positions = [order_map[char] for char in word]
            positions.append(word_positions)    
        for i in range(len(positions)-1):
            for j in range(len(positions[i])):
                if j<=len(positions[i+1])-1:
                    if positions[i][j]<positions[i+1][j]:
                        break
                    elif positions[i][j]==positions[i+1][j]:
                        continue
                    else:
                        return False
                else:
                     return False
        return True                            

                       