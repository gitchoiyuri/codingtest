import sys
n = int(sys.stdin.readline())

num = []

for i in str(n) :   # str : 문자열로 변환
    num.append(int(i))

num.sort(reverse=True)

for i in num :
    print(i, end="")