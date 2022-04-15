word = input()
word_list = list(word) # set은 중복되지 않은 원소만 남김

alpha = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']

sec = 0
for i in word_list :
    for j in alpha :
        if i in j :
            # alpha의 index에서 3초를 더한다
            sec += alpha.index(j) + 3
print(sec)