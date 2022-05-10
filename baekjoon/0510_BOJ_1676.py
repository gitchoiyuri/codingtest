import sys
from math import factorial
input = sys.stdin.readline

n = int(input())
nf = factorial(n)
cnt = 0

for i in str(nf)[::-1] :
    if i != '0' :
        break
    cnt += 1
print(cnt)
