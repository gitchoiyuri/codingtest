import sys
input = sys.stdin.readline

n,m = map(int,input().split())
'''
for i in str(c)[::-1] :
    if i != '0' :
        break
    cnt += 1
print(cnt)
'''
def count_num (a,b) :
    cnt = 0
    while a:
        a //= b
        cnt += a
    return cnt

five = count_num(n,5) - count_num(m,5) - count_num(n-m,5)
two = count_num(n,2) - count_num(m,2) - count_num(n-m,2)

print(min(five,two))
