import sys
input = sys.stdin.readline
num =[]
n = int(input())

num=list(map(int,input().split()))

print(min(num)*max(num))