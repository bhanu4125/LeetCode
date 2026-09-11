class Solution:
    def totalNumbers(self, digits: List[int]) -> int:
        n = len(digits)
        p=0
        a=[]
        for i in permutations(digits,3):
            if i[0]!=0 and i[-1]%2==0 and i not in a:
                a.append(i)
                p+=1
                
        return p