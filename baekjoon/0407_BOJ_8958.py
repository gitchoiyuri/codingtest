a = int(input())

for i in range(a) :
    test = list(input())
    sum = 0
    c = 1
    for i in test :
        if(i=='O') :
            sum += c
            c += 1
        else :
            c = 1
    print(sum)

