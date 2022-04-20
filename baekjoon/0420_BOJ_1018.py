n,m= map(int,input().split())
board = []
cnt = []

for i in range(n) :
    board.append(input())

for a in range(n-7) :
    for b in range(m-7) :
        idw = 0
        idb = 0
        for c in range(a,a+8) :
            for d in range(b,b+8) :
                if (c+d) % 2 == 0 :
                    if board[c][d] != 'W' :
                        idw += 1
                    if board[c][d] != 'B' :
                        idb += 1
                else :
                    if board[c][d] != 'B':
                        idw += 1
                    if board[c][d] != 'W':
                        idb += 1
        cnt.append(min(idw,idb))
print(min(cnt))