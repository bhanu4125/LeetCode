class Solution:
    def stoneGame(self, piles: List[int]) -> bool:
        a = []
        b = []
        n = len(piles)
        i=0
        j=n-1
        c=0
        while i<=j:
            if c%2==0:
                if max(piles[i],piles[j]) == piles[i]:
                    a.append(piles[i])
                    i+=1
                else:
                    a.append(piles[j])
                    j-=1
            else:
                if max(piles[i],piles[j]) == piles[j] :
                    b.append(piles[j])
                    j-=1
                else:
                    b.append(a[i])
                    i+=1
        if sum(a) > sum(b):
            return True
        return False