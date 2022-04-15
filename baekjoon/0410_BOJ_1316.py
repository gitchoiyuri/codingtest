word_cnt = int(input())
grp = word_cnt
for i in range(word_cnt) :
    word = input()
    for index in range(len(word)-1) :
        if word[index] == word[index+1]:
            pass
        elif word[index] in word[index+1:]:
            grp -= 1
            break
print(grp)