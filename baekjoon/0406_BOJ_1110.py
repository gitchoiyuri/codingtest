n = int(input())
num = n
cnt = 0 # 사이클 수

while True :
    a = num //10 # 10의 자리
    b = num % 10 # 1의 자리
    c = (a+b) % 10 # 새로운 1의 자리
    num = b*10 +c # 새로운 num

    cnt += 1
    if (num == n) :
        break
print(cnt)