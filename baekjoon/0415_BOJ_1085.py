x,y,w,h = map(int,(input().split()))
"""
if x>y :
    if y > w-x :
        if w-x > h-y :
            print(h-y)
        else :
            print(w-x)
    else :
        if y > h-y :
            print(h-y)
        else :
            print(y)
else :
    if x > w - x:
        if w - x > h - y:
            print(h - y)
        else:
            print(w - x)
    else:
        if x > h - y:
            print(h - y)
        else:
            print(x)
"""
print(min(x,y,w-x,h-y))