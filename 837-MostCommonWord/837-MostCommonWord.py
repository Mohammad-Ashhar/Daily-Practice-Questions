# Last updated: 31/07/2025, 21:14:57
class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        word_list = re.findall(r'\b\w+\b', paragraph.lower())
        word_list=[word for word in word_list if word not in banned]
        dic={}
        for i in word_list:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        print(dic)
        m=-1
        most=""
        for key,value in dic.items():
            if value>m:
                m=value
                most=key
        return most                    