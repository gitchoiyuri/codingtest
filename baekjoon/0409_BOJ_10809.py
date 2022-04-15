word = input()
alpha = list(range(97,123)) # 아스키코드 숫자 범위
for i in alpha :
    print(word.find(chr(i))) # chr 합수 : 문자열로 변환, find는 문자열에서만 사용