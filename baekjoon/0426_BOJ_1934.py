import sys
input=sys.stdin.readline

t= int(input())

for i in range(t) :
    a,b=map(int,input().strip().split())
    aa,bb=a,b

    while bb!=0 :
        aa=aa%bb
        aa,bb=bb,aa
    print(a*b//aa)