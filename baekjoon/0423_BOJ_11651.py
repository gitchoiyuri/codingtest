import sys
n = int(sys.stdin.readline())
arr=[]
for i in range(n) :
    a,b = map(int,sys.stdin.readline().split())
    arr.append([b,a]) # b좌표 순서대로 정렬
arr.sort()
for b,a in range(n) :   # a,b 순서로 출력
    print(a,b)