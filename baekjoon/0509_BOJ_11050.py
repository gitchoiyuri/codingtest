import sys
input = sys.stdin.readline

a, b = map(int,input().split())

def fac(n) :
    if n == 0 :
        return 1
    return n*fac(n-1)
print(fac(a)//(fac(b)*fac(a-b)))