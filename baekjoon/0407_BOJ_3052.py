''' 내가 짠 코드
arr = []
arr2 = []
for i in range(10) :
    arr.append(int(input()))

for i in range(10) :
    arr2.append(arr[i]%42)

cnt = set(arr2) # set은 중복을 제거해주는 역할
print(len(cnt))
'''
# 다른 사람 코드
arr = []
for i in range(10):
    n = int(input())
    arr.append(n % 42)
arr = set(arr)
print(len(arr))