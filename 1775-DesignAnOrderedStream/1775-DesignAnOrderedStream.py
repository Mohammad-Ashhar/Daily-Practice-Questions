# Last updated: 31/07/2025, 21:11:06
class OrderedStream:

    def __init__(self, n: int):
        self.stream= [[]]* (n+1)
        self.pointer = 1
        self.n=n

    def insert(self, idKey: int, value: str) -> List[str]:
        self.stream[idKey] = [idKey , value]
        chunk=[]
        while self.stream[self.pointer] != [] :
            chunk.append(self.stream[self.pointer][1])

            if self.pointer == (self.n):
                return chunk
            self.pointer+=1


        return chunk


# Your OrderedStream object will be instantiated and called as such:
# obj = OrderedStream(n)
# param_1 = obj.insert(idKey,value)