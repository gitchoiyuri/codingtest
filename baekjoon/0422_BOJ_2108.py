import sys

n = int(sys.stdin.readline())
num=[]
for i in range(n) :
    num.append(int(sys.stdin.readline()))

print(round(sum(num)/n)) # 산술평균
cnt1 = n//2

print(sorted(num)[cnt1]) # 중앙값

from collections import Counter
num.sort()
num_s = Counter(num).most_common()

if len(num_s) > 1 :
    if num_s[0][1] == num_s[1][1] :
        print(num_s[1][0])
    else :
        print(num_s[0][0])
else :
    print(num_s[0][0])

print(max(num)-min(num)) # 범위