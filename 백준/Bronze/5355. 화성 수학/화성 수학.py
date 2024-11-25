n = int(input())

for i in range(n) :
    a = list(map(str,input().split()))
    result = float(a[0])
    for i in range(1, len(a)) :
        if a[i] == '@' :
            result *= 3
        if a[i] == '%' :
            result += 5
        if a[i] == '#':
            result -= 7
    print('{:.2f}'.format(result))
