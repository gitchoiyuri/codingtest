a = int(input())
cnt = 0

for i in range(1, a+1) :
    b = list(map(int, str(i)))
    if i < 100 : # 100보다 작으면 모두 한수
        cnt += 1
    elif b[0] - b[1] == b[1] - b[2] :
        cnt += 1
print(cnt)