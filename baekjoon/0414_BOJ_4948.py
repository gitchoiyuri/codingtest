from math import sqrt

def isPrime(x) :
    if x == 1:
        return False
    for i in range(2, int(sqrt(x))+1) :
        if x % i == 0 :
            return False
    return True

case = list(range(2,246912))
sort = []
for i in case :
    if isPrime(i) :
        sort.append(i)

while True :
    n= int(input())
    cnt = 0
    if n == 0 :
        break
    for i in sort :
        if n < i <= 2*n :
            cnt += 1
    print(cnt)
