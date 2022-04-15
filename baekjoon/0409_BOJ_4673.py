# set은 집합과 유사
num = set(range(1,10001)) # range는 정수 범위 반환
remove_num = set();

for i in num :
        for j in str(i) :
            i += int(j)
        remove_num.add(i) # set에 추가할때는 append 대신에 add 사용

self_num = num - remove_num # set은 '-' 연산자로 차집합 구함
for self_num in sorted(self_num) : # sorted로 정렬 수행
    print(self_num)