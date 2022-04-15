n = int(input())
for i in range(n) :
    score = list(map(int,input().split()))
    mean_score = sum(score[1:])/score[0]
    cnt = 0

    for j in score[1:]:
        if j > mean_score:
            cnt += 1
    rate = cnt / score[0] * 100
    print("%.3f" %rate + '%')
