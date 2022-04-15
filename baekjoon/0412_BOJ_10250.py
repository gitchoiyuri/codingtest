t = int(input())
room = 0
for i in range(t) :
    h,w,n = map(int,input().split())
    if n % h != 0 :
        room = (n%h)*100 + ((n//h)+1)
        print(room)
    else :
        room = h * 100 + n//h
        print(room)
