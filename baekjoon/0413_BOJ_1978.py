n = int(input())
num = map(int,input().split())
cnt = 0
for j in num :
    err = 0
    if j > 1 :
        for i in range (2, j) :
            if j % i == 0 :
                err += 1
        if err == 0 :
            cnt +=1
print(cnt)