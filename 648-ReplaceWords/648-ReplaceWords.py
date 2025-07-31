# Last updated: 31/07/2025, 21:15:34
class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        sentence=sentence.split()
        for i,word in enumerate(sentence):
            matches=[w for w in dictionary if word.startswith(w)]
            if matches:
                shortest_match=min(matches,key=len)
                sentence[i]=shortest_match
        return ' '.join(sentence)        