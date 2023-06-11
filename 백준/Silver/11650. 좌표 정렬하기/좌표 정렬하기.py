# x좌표가 증가하는 순, 같으면 y좌표가 증가하는 순

import sys

n=int(input())
tp=[]

for i in range(n):
    [x, y] = list(map(int, sys.stdin.readline().split()))
    tp.append([x, y])

tp.sort()
for j in range(n):
    print(tp[j][0], tp[j][1])

