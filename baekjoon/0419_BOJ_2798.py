n,m = map(int,input().split())
num = list(map(int,input().split()))
result = 0
max = 0

for i in range (n-2) :
    for j in range(i+1, n-1) :
        for k in range(j+1, n) :
            if num[i]+num[j]+num[k] > m :
                continue
            else :
                result = num[i]+num[j]+num[k]
                if max <= result :
                    max = result
print(max)
