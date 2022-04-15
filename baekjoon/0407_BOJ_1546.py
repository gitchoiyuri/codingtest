n = int(input())
score = list(map(int,input().split()))
max_ = max(score)

for i in range(n) :
    score[i] = score[i]/max_*100
fake_avg = sum(score)/n
print(fake_avg)
