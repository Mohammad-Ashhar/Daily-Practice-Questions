# Last updated: 31/07/2025, 21:15:00
class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morse_code_list = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        letters = string.ascii_lowercase
        morse_dict = dict(zip(letters, morse_code_list))
        a=[]
        for i in range(len(words)):
            s=""
            for j in range(len(words[i])):
                s+=morse_dict[words[i][j]]
            a.append(s)    
        return len(set(a))    

        
  