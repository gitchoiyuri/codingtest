def gold():
    check = [False]*2 + [True] * 10000

    for i in range(2,101) :
        if check[i] == True :
            for j in range(i+i, 10001, i) :
                check[j] = False
    t = int(input())
    for _ in range(t) :
        n = int(input())

        a = n //2
        b = a
        for _ in range(10000) :
            if(check[a] and check[b]) :
                print(a,b)
                break
            a-=1
            b+=1
gold()