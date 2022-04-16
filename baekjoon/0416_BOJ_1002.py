import math

t = int(input())
for _ in range(t) :
    x1, y1, r1, x2, y2, r2 = map(int,input().split())
    dst = math.sqrt((x1-x2)**2 + (y1-y2)**2)
    if dst == 0 and r1 == r2 : # 동심원이고 반지름 동일
        print(-1)
    elif abs(r1-r2) == dst or r1 + r2 == dst : # 내접, 외접
        print(1)
    elif abs(r1-r2) < dst < r1+r2 : # 서로 다른 두 점에서 만남
        print(2)
    else :
        print(0)

