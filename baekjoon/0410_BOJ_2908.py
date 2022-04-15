a, b = map(str,input().split())
a_list = ''.join(reversed(a)) # join은 문자열로 변환
b_list = ''.join(reversed(b))
if a_list > b_list :
    print(a_list)
else :
    print(b_list)