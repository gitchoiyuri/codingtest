input_num = int(input())

line = 0 # 사선 라인
max_num = 0
while input_num > max_num :
    line += 1
    max_num += line

gap = max_num - input_num
if line % 2 == 0 :
    top = line - gap
    under = gap +1
else :
    top = gap +1
    under = line - gap
print("%d/%d"%(top,under))