n = int(input())
def sum(a) :
    result = 1
    if a> 0 :
        result = a *sum(a-1)
    return result

print(sum(n))